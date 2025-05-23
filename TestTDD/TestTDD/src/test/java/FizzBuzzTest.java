import javax.print.attribute.standard.Sides;

public class FizzBuzzTest {
/*Escribe una función que tome enteros positivos y muestre su representación en cadena.

Tu función debe cumplir las siguientes normas adicionales:

Si el número es múltiplo de tres, devolverá la palabra "Fizz".
Si el número es múltiplo de cinco, devolverá la palabra "Buzz".
Si el número es múltiplo de tres y de cinco, devolverá la palabra "FizzBuzz".
Por ejemplo, dados los números del 1 al 15 en orden, la función devolvería:







1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz */


    @Test
    void convert_1_to_1() {
    assertEquals(1, newFizzBuzz().convert(1));
    }
}