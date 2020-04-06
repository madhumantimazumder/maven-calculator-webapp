package com.madhumanti.calculator;

import org.junit.Test;

import com.madhumanti.calculator.CalculatorService;

import static org.junit.Assert.*;

import org.json.simple.parser.ParseException;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testCalculate() throws ParseException {
        assertEquals(2, new CalculatorService().calculate("'1*2'"));
    }

}
