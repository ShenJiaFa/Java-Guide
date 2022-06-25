package com.shenjiafa.practice.complex_practice.simulate_cinema.run;

import com.shenjiafa.practice.complex_practice.simulate_cinema.bean.Business;
import com.shenjiafa.practice.complex_practice.simulate_cinema.bean.Customer;
import com.shenjiafa.practice.complex_practice.simulate_cinema.bean.Movie;
import com.shenjiafa.practice.complex_practice.simulate_cinema.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;


public class RunApp {

    /**
     * All users of system
     */
    private static final List<User> ALL_USERS = new ArrayList<User>();

    /**
     * All users of system
     */
    private static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<Business, List<Movie>>();

    /**
     * Scanner
     */
    private static final Scanner SYS_SC = new Scanner(System.in);

    /**
     * User logged in system
     */
    private static User loginUser;

    /**
     * SimpleDateFormat class
     */
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /**
     * Log class
     */
    private static final Logger LOG = LoggerFactory.getLogger(RunApp.class);

    // Prefab some data in system
    static {
        // Create customer date
        Customer Jim = new Customer();
        Jim.setLoginName("jim001");
        Jim.setPassword("123");
        Jim.setUserName("JIM");
        Jim.setGender("Male");
        Jim.setMoney(100);
        Jim.setPhone("123456");
        ALL_USERS.add(Jim);
        Customer Jack = new Customer();
        Jack.setLoginName("jack001");
        Jack.setPassword("123");
        Jack.setUserName("JACK");
        Jack.setGender("Male");
        Jack.setMoney(200);
        Jack.setPhone("123321");
        ALL_USERS.add(Jack);
        Customer Lily = new Customer();
        Lily.setLoginName("Lily001");
        Lily.setPassword("123");
        Lily.setUserName("LILY");
        Lily.setGender("Female");
        Lily.setMoney(100);
        Lily.setPhone("122112");
        ALL_USERS.add(Lily);

        // Create Business date
        Business wandaCinema = new Business();
        wandaCinema.setUserName("Sophia");
        wandaCinema.setGender("Female");
        wandaCinema.setLoginName("wanda");
        wandaCinema.setPassword("wanda123");
        wandaCinema.setShopAddress("Beijing");
        wandaCinema.setShopName("Wanda-Cinema");
        wandaCinema.setPhone("10081");
        ALL_USERS.add(wandaCinema);
        List<Movie> movieList1 = new ArrayList<>();
        ALL_MOVIES.put(wandaCinema, movieList1);

        Business happinessCinema = new Business();
        happinessCinema.setUserName("james");
        happinessCinema.setGender("Male");
        happinessCinema.setLoginName("happiness");
        happinessCinema.setPassword("happiness123");
        happinessCinema.setShopAddress("Shanghai");
        happinessCinema.setShopName("Happiness-Cinema");
        happinessCinema.setPhone("100082");
        ALL_USERS.add(happinessCinema);
        List<Movie> movieList2 = new ArrayList<>();
        ALL_MOVIES.put(happinessCinema, movieList2);

    }

    public static void main(String[] args) {

        // System front page
        frontPage();

    }

    /**
     * Project front page
     */
    private static void frontPage() {

        while (true) {
            System.out.println("=====Cinema Management System=====");
            System.out.println("1.Log in");
            System.out.println("2.User register");
            System.out.println("3.Business register");
            System.out.println("----------------------------------");
            System.out.println("Please enter command:");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "1":
                    logIn();
                    break;
                default:
                    System.out.println("Bad input! Restart:...");
            }
        }

    }

    /**
     * Log in system
     */
    private static void logIn() {

        while (true) {
            System.out.println("Please enter login name:");
            String loginName = SYS_SC.nextLine();
            System.out.println("Please enter password:");
            String password = SYS_SC.nextLine();
            // Query user object based on login name
            User user = queryUserTypeByLoginName(loginName);
            // Determine if the user exists
            if (null != user) {
                // Check password
                if (Objects.equals(user.getPassword(), password)) {
                    loginUser = user;
                    LOG.info(loginUser.getLoginName() + "logged in to the system;");
                    // Determine whether it is a business or a customer
                    if (user instanceof Customer) {
                        //Show customer user front page
                        showCustomerFrontPage();
                    } else {
                        //Show business user front page
                        showBusinessFrontPage();
                    }
                    return;
                } else {
                    System.out.println("wrong password!");
                }

            } else {
                System.out.println("login name error!");
            }
        }
    }

    /**
     * Show business front page
     */
    private static void showBusinessFrontPage() {

        while (true) {
            System.out.println("Hi! " + (Objects.equals(loginUser.getGender(), "Male") ? "Mr." : "MS.") + loginUser.getUserName() + " Welcome to the system!");
            System.out.println("-----------Business Page-----------");
            System.out.println("1.Show business details");
            System.out.println("2.Add movie");
            System.out.println("3.Remove movie");
            System.out.println("4.Modify movie");
            System.out.println("5.Exit");

            System.out.println("Please enter command:");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "1":
                    showBusinessDetails();
                    break;
                case "2":
                    addMovie();
                    break;
                case "3":
                    removeMovie();
                    break;
                case "4":
                    modifyMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + " goodbye!");
                    return;
                default:
                    System.out.println("Bad input! Restart:...");
            }
        }
    }

    /**
     * Modify movie
     */
    private static void modifyMovie() {

        System.out.println("-----------Modify Movie-----------");
        Business business = (Business) loginUser;
        List<Movie> movieList = ALL_MOVIES.get(business);
        if (movieList.size() == 0) {
            System.out.println("There are currently no movies to modify!");
        }

        while (true) {
            System.out.println("Please enter the name of the deleted movie:");
            // Let the user enter the name of the movie that needs to be removed
            String movieName = SYS_SC.nextLine();
            // Find movie by movie name
            Movie targetMovie = getMovieByMovieName(movieName, movieList);
            if (null != targetMovie) {
                try {
                    System.out.println("Please enter the movie name:");
                    String name = SYS_SC.nextLine();
                    targetMovie.setName(name);
                    System.out.println("Please enter the movie actor:");
                    String actor = SYS_SC.nextLine();
                    System.out.println("Please enter the movie duration:");
                    String duration = SYS_SC.nextLine();
                    System.out.println("Please enter the movie price:");
                    String price = SYS_SC.nextLine();
                    System.out.println("Please enter the ticket remainder:");
                    String remainder = SYS_SC.nextLine();
                    System.out.println("Please enter the start time:");
                    String startTime = SYS_SC.nextLine();
                    // Start modify
                    targetMovie.setName(name);
                    targetMovie.setActor(actor);
                    targetMovie.setDuration(Double.parseDouble(duration));
                    targetMovie.setPrice(Double.parseDouble(price));
                    targetMovie.setRemainder(Integer.parseInt(remainder));
                    targetMovie.setStartTime(sdf.parse(startTime));
                    System.out.println("<<" + targetMovie.getName() + ">>" + "Successfully modified!");
                    showBusinessDetails();
                    return;
                } catch (Exception e) {
                    System.out.println("Bad input! Please retry...");
                }
            }
            System.out.println("No such movie in your movie library!");
            System.out.println("Do you want to retry modify? Press Y for positive, other keys for negative:");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "Y":
                    break;
                default:
                    System.out.println("OK...Return to the business front page!");
                    return;
            }
        }
    }

    /**
     * Remove movie
     */
    private static void removeMovie() {

        System.out.println("-----------Remove Movie-----------");
        Business businessUser = (Business) loginUser;
        List<Movie> movieList = ALL_MOVIES.get(businessUser);
        if (movieList.size() == 0) {
            System.out.println("There are currently no movies to remove!");
            return;
        }
        while (true) {
            System.out.println("Please enter the name of the deleted movie:");
            // Let the user enter the name of the movie that needs to be removed
            String movieName = SYS_SC.nextLine();
            // Find movie by movie name
            Movie targetMovie = getMovieByMovieName(movieName, movieList);
            if (null != targetMovie) {
                movieList.remove(targetMovie);
                System.out.println("Current movie has been removed from your movie library!");
                showBusinessDetails();
                return;
            }
            System.out.println("No such movie in your movie library... Unable to perform deletion!");
            System.out.println("Do you want to retry remove? Press Y for positive, other keys for negative:");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "Y":
                    break;
                default:
                    System.out.println("OK...Return to the business front page!");
                    return;
            }
        }
    }

    /**
     * Get movie object by movie name
     *
     * @param movieName Movie name
     * @param movieList Movie list
     * @return Target movie
     */
    private static Movie getMovieByMovieName(String movieName, List<Movie> movieList) {
        for (Movie movie : movieList) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Add movie
     */
    private static void addMovie() {
        while (true) {
            try {
                // Input movie infos
                List<Movie> movieList = ALL_MOVIES.get(loginUser);
                System.out.println("Please enter movie name:");
                String name = SYS_SC.nextLine();
                System.out.println("Please enter movie actor:");
                String actor = SYS_SC.nextLine();
                System.out.println("Please enter movie duration:");
                String duration = SYS_SC.nextLine();
                System.out.println("Please enter movie price:");
                String price = SYS_SC.nextLine();
                System.out.println("Please enter movie tickets remainder:");
                String remainder = SYS_SC.nextLine();
                // Enter time until the correct time is received
                System.out.println("Please enter movie start time:");
                String startTime = SYS_SC.nextLine();
                Movie movie = new Movie(name, actor, Double.parseDouble(duration), Double.parseDouble(price), Integer.parseInt(remainder), sdf.parse(startTime));
                movieList.add(movie);
                System.out.println("<<" + movie.getName() + ">>" + "has been added successfully!");
                return;
            } catch (Exception e) {
                System.out.println("Bad input! Please retry...");
                LOG.error("Failed to parse input");
            }
        }
    }

    /**
     * Show business details
     */
    private static void showBusinessDetails() {

        // Show shop details
        System.out.println("-----------Show Business Details-----------");
        Business business = (Business) loginUser;
        System.out.println("*Shop Name: " + business.getShopName() + "\n" + "*Shop Address: " + business.getShopAddress() + "\n" + "*Shop Phone: " + business.getPhone());
        List<Movie> movieList = ALL_MOVIES.get(business);
        // Show movie details
        if (Objects.equals(movieList.size(), 0)) {
            System.out.println("There Are No Movies Info Here!");
            LOG.warn("There are currently no movies in the movie library!");
        } else {
            System.out.println("[Movie information]:");
        }
        movieList.forEach(m -> System.out.println("************************************\n" + "*Name:" + m.getName() + "\n" + "*Actor:" + m.getActor() + "\n" + "*Score:" + m.getScore() + "\n" + "*Duration:" + m.getDuration() + "\n" + "*Price:" + m.getPrice() + "\n" + "*Remainder:" + m.getRemainder() + "\n" + "*Start Time:" + sdf.format(m.getStartTime())));
    }

    /**
     * Show customer front page
     */
    private static void showCustomerFrontPage() {

        while (true) {
            System.out.println("-----------Custom front Page-----------");
            System.out.println("1.Show all movie info");
            System.out.println("2.Query movie information by movie name");
            System.out.println("3.Rate movie");
            System.out.println("4.Buy movie tickets");
            System.out.println("5.Exit");
            System.out.println("Please enter command:");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "1":
                    showAllMoviesInfo();
                    break;
                case "2":
                    queryMovieInfoByName();
                    break;
                case "3":
                    rateMovie();
                    break;
                case "4":
                    buyTicket();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + " goodbye!");
                    return;
                default:
                    System.out.println("Bad input! Please Restart:...");
            }
        }
    }

    /**
     * Customer buy movie ticket method
     */
    private static void buyTicket() {

        System.out.println("-----------Buy Ticket-----------");
        showAllMoviesInfo();
        while (true) {
            System.out.println("Please enter the name of the cinema which you want to buy movie ticket:");
            String shopName = SYS_SC.nextLine();
            // Get business object by shop name
            Business business = getBusinessByShopName(shopName);
            if (null == business) {
                System.out.println("The cinema was not found, please retry...");
                System.out.println("Do you want to continue? Press Y for positive, other keys for negative:");
                String cmd = SYS_SC.nextLine();
                switch (cmd) {
                    case "Y":
                        break;
                    default:
                        System.out.println("OK...Return to the customer front page!");
                        return;
                }
            } else {
                System.out.println("Shop selection is successful!");
                // Show all movies in this theater
                List<Movie> movieList = ALL_MOVIES.get(business);
                if (movieList.size() > 0) {
                    // Start choosing movies
                    while (true) {
                        System.out.println("Please enter the movie name which you want to buy");
                        String targetMovieName = SYS_SC.nextLine();
                        Movie targetMovie = getMovieByBusinessAndMovieName(business, targetMovieName);
                        if (null != targetMovie) {
                            while (true) {
                                // Start buy ticket
                                System.out.println("Please enter how many movie tickets you would like to buy:");
                                String count = SYS_SC.nextLine();
                                int buyCount = Integer.parseInt(count);
                                if (targetMovie.getRemainder() >= buyCount) {
                                    // Can buy
                                    double price = BigDecimal.valueOf(targetMovie.getPrice()).multiply(BigDecimal.valueOf(buyCount)).doubleValue();
                                    if (loginUser.getMoney() >= price) {
                                        loginUser.setMoney(loginUser.getMoney() - price);
                                        business.setMoney(business.getMoney());
                                        targetMovie.setRemainder(targetMovie.getRemainder() - Integer.parseInt(count));
                                        System.out.println("Successful purchase: " + targetMovie.getName() + "*" + count);
                                        return;
                                    } else {
                                        // do not have enough money
                                        System.out.println("Your balance is not enough!");
                                        System.out.println("Do you want to continue purchasing ticket? Press Y for positive, other keys for negative:");
                                        String cmd = SYS_SC.nextLine();
                                        switch (cmd) {
                                            case "Y":
                                                break;
                                            default:
                                                System.out.println("OK...Return to the customer front page!");
                                                return;
                                        }
                                    }
                                } else {
                                    //Can not buy
                                    System.out.println("The remainder of this movie is not enough!");
                                    System.out.println("Do you want to modify count? Press Y for positive, other keys for negative:");
                                    String cmd = SYS_SC.nextLine();
                                    switch (cmd) {
                                        case "Y":
                                            break;
                                        default:
                                            System.out.println("OK...Return to the customer front page!");
                                            return;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Can not find this movie! Please retry...");
                            System.out.println("Do you want to modify movie name? Press Y for positive, other keys for negative:");
                            String cmd = SYS_SC.nextLine();
                            switch (cmd) {
                                case "Y":
                                    break;
                                default:
                                    System.out.println("OK...Return to the customer front page!");
                                    return;
                            }
                        }
                    }

                } else {
                    System.out.println("Sorry, this cinema is currently closed!");
                    System.out.println("Do you want to continue buying tickets? Press Y for positive, other keys for negative:");
                    String cmd = SYS_SC.nextLine();
                    switch (cmd) {
                        case "Y":
                            break;
                        default:
                            System.out.println("OK...Return to the customer front page!");
                            return;
                    }
                }

            }
        }
    }

    /**
     * Get movie object by business object and movie name
     *
     * @param business  Business object
     * @param movieName Target movie name
     * @return
     */
    private static Movie getMovieByBusinessAndMovieName(Business business, String movieName) {

        // Get movie list by business object
        List<Movie> movieList = ALL_MOVIES.get(business);
        for (Movie movie : movieList) {
            if (Objects.equals(movie.getName(), movieName)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Get business object by shop name
     *
     * @param shopName Shop name
     * @return Business
     */
    private static Business getBusinessByShopName(String shopName) {

        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (Objects.equals(business.getShopName(), shopName)) {
                return business;
            }
        }
        return null;
    }

    /**
     * Rate movie
     */
    private static void rateMovie() {
        System.out.println("Please enter movie name:");
        String movie = SYS_SC.nextLine();
        while (true) {
            try {
                System.out.println("Please enter your score");
                String score = SYS_SC.nextLine();
                ALL_MOVIES.forEach((k, v) -> {
                    v.forEach(m -> {
                        if (Objects.equals(m.getName(), movie)) {
                            m.setScore(Double.parseDouble(score));
                            return;
                        }
                    });
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Query movie info by Name
     */
    private static void queryMovieInfoByName() {
        System.out.println("Please enter movie name:");
        String movie = SYS_SC.nextLine();
        ALL_MOVIES.forEach((k, v) -> {
            v.forEach(m -> {
                if (Objects.equals(m.getName(), movie)) {
                    System.out.println(m);
                }
            });
        });
    }

    /**
     * Show all movie info from all business
     */
    private static void showAllMoviesInfo() {
        ALL_MOVIES.forEach((business, movieList) -> {
            System.out.println("*Shop Name: " + business.getShopName() + "\n" + "*Shop Address: " + business.getShopAddress() + "\n" + "*Shop Phone: " + business.getPhone());
            if (movieList.size() == 0) {
                System.out.println("*" + business.getShopName() + ": There Are No Movies Info Here!");
            } else {
                System.out.println("[Movie information]:");
            }
            movieList.forEach(m -> System.out.println("************************************\n" + "*Name:" + m.getName() + "\n" + "*Actor:" + m.getActor() + "\n" + "*Score:" + m.getScore() + "\n" + "*Duration:" + m.getDuration() + "\n" + "*Price:" + m.getPrice() + "\n" + "*Remainder:" + m.getRemainder() + "\n" + "*Start Time:" + sdf.format(m.getStartTime())));
        });


    }

    /**
     * Query user type by login name
     *
     * @param loginName Login name
     * @return User
     */
    private static User queryUserTypeByLoginName(String loginName) {

        for (User user : ALL_USERS) {
            if (Objects.equals(user.getLoginName(), loginName)) {
                return user;
            }
        }
        return null;
    }

}
