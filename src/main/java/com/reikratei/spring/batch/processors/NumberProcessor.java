package com.reikratei.spring.batch.processors;

import com.reikratei.spring.batch.entities.Number;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author manuel
 * @version 12/1/16
 */
public class NumberProcessor implements ItemProcessor<Number, Number> {
    private static Number number = null;

    @Override
    public Number process(Number number) throws Exception {
        if (NumberProcessor.number == null) {
            setNumber(number);
        } else
            number.add(getNumber());
        return number;
    }

    private static void setNumber(Number number) {
        NumberProcessor.number = number;
    }

    private static Number getNumber() {
        return number;
    }
}
