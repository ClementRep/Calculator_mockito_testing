package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import org.example.Service.CalculatorService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculatorTest {

    private MathApplication mathApplication;


    //the mock annotation takes the interface from the interface service
    //Then creates a mock of it basically we mimic the service to run everything it does without touching it

    @Mock
    private CalculatorService calculatorService; // Mock the service

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);  // Initializes mocks
        mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService); // Set the mock service
    }

    @Test
    public void testAdd() {
        // Arrange
        double a = 10.0;
        double b = 20.0;
        double expected = 30.0;

        // Mock the add behavior of the calculator service
        //basically the when tells us that when service add a,b we expect this
        when(calculatorService.add(a, b)).thenReturn(expected);

        // Act
        double result = mathApplication.add(a, b);

        // Assert
        assertEquals("The addition result is incorrect", expected, result, 0.001); // Delta added for precision
    }

    @Test
    public void testsubtract(){
        double a=10.0;
        double b=20.0;
        double expected=30.0;

        when(calculatorService.subtract(a,b)).thenReturn(expected);
        //ACT
        double result=mathApplication.subtract(a,b);

        //ASSERT
        assertEquals("The expected results where not correct",expected,result,0.001);
    }

    @Test
    public void testmultiply(){

        //ARRANGE

        double a=10.4;
        double b=10.4;
        double expected=20.8;


        when(calculatorService.multiply(a,b)).thenReturn(expected);

        //ACT
        double result= mathApplication.multiply(a,b);

        //ASSERT

        assertEquals("this is incorrect expected result",expected,result,0.001);


    }

@Test
    public void divide(){
        //ARRANGE
        double a=23.0;
        double b=12.6;
        double expected=35.6;

        when(calculatorService.divide(a,b)).thenReturn(expected);

        double result= mathApplication.divide(a,b);

         assertEquals("not expected",expected,result,0.001);
    }

}
