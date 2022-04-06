package java_all.java_se.practice.orient_process.crawl_info;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Function: Simulate crawling information
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class CrawlInfo {
    public static void main(String[] args) {

        //Source data
        String sourceData = "征婚启事:本人名叫张三,今年30岁,身高175cm,长相英俊帅气,学历高中,目前的职业是厨师,烧的菜非常好吃!现寻女友一枚,漂亮就行,有意者跟我联系,我的电话是13971919851,邮箱是wsvsg@163.com,固定电话是025-88888888欢迎广大美女和我联系!";

        //Write regex
        String regex = "\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}|1[3-9]\\d{9}|0\\d{2,6}-?\\d{5,20}";

        //A set of processes for crawling information
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sourceData);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
