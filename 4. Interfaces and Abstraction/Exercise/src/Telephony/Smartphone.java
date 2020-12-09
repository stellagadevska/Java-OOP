package Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String call() {
        StringBuilder calledNumbers = new StringBuilder();

        Pattern pattern = Pattern.compile("^([0-9]+)$");

        for (String number : this.numbers) {
            Matcher matcher = pattern.matcher(number);

            if (matcher.find()) {
                calledNumbers.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            } else {
                calledNumbers.append("Invalid number!")
                        .append(System.lineSeparator());
            }

        }

        return calledNumbers.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder browserWebsites= new StringBuilder();
        Pattern pattern = Pattern.compile("^([^0-9]+)$");

        for (String url : this.urls) {
            Matcher matcher = pattern.matcher(url);

            if (matcher.find()) {
                browserWebsites.append("Browsing: ")
                        .append(url)
                        .append("!")
                        .append(System.lineSeparator());
            } else {
                browserWebsites.append("Invalid URL!")
                        .append(System.lineSeparator());
            }

        }
        return browserWebsites.toString().trim();
    }

}
