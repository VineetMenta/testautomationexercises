package com.cnu.mentoring.vineet.cdp.java8.HomeTask_09_DateTime;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeTests {

    private static final Logger LOGGER = Logger.getLogger(DateTimeTests.class);

    Predicate<LocalDate> isYesterday = (date) -> LocalDate.now().minusDays(1).isEqual(date);
    Supplier<LocalDate> nextThursday = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
    Supplier<LocalDate> estTime = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
    Consumer<LocalDate> ageOfPerson = (birthday) -> {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        LOGGER.info(period.getYears());
    };

    @Test
    public void isDateYesterdaysDate(){
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        Assert.assertTrue(isYesterday.test(yesterday));
    }

    @Test
    public void getNextThursday(){
        LOGGER.info(nextThursday.get());
    }

    @Test
    public void getCurrentTimeInEst(){
        LOGGER.info(estTime.get());
    }

    @Test
    public void calculateAgeOfPerson(){
        LocalDate date = LocalDate.of(1998,8,16);
        ageOfPerson.accept(date);
    }
}
