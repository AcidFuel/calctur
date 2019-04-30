/**
* Устанавливаем принадлежность класса к пакету testPackage
*/
package test;

/**
* Импортируем библиотеку
*/
import static org.junit.Assert.*;
/**
* Импортируем библиотеку
*/
import org.junit.*;

import classPackage.classClientFrame;
/**
* Импортируем класс Calculator
*/
import mainPackage.Calculator;

/**
 * Основной класс
 */
public class b_Test {
	/**
	 * Объявляем переменную типа Calculator
	 */
	private classClientFrame test;

/**
* Обозначаем , что следующий метод будет тестируемым
*/
@Test
/**
* тестируемый метод
*/
public void testCCF() {
/**
* Инициализируем переменную test
*/
test = new classClientFrame();
/**
* Тестируем метод с входными параметрами 4, 6, 1.85, 1.75, 2450, 2250, 2050, 1.95 и с предполагаемым результатом 331256.25
*/
assertNull(test.txtfield[1]);
}
}
