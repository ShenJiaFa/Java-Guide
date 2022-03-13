package airline_ticket;

/**
 * function: Calculate the ticket price
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/3/13-12:43
 */
public class AirLineTicket {
    public static void main(String[] args) {
        System.out.println(getFinalPrice(1000, 1, 0));
    }

    /**
     * Calculate method
     *
     * @param originalPrice Original price
     * @param month         Corresponding month
     * @param ticketType    Warehouse type
     * @return Final price
     */
    public static double getFinalPrice(double originalPrice, int month, int ticketType) {
        //Peak season conditions
        if (month >= 5 && month <= 10) {
            switch (ticketType) {
                case 1:
                    return originalPrice * 0.9;
                case 0:
                    return originalPrice * 0.85;
                default:
                    return -1;
            }
        } else if (month >= 1 && month <= 4 || month == 11 || month == 12) {
            //Off season conditions
            switch (ticketType) {
                case 1:
                    return originalPrice * 0.7;
                case 0:
                    return originalPrice * 0.65;
                default:
                    return -1;
            }
        } else {
            return -1;
        }
    }
}
