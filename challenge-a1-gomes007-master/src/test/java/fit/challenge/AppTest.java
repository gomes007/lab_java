package fit.challenge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testes unitários para o "desafio"
 */
public class AppTest {
	/**
	 * Vamos garantir a estrutura do projeto que queremos
	 */
	@Test
	public void shouldHaveCalculateAsStaticMethodOfImcCalculatorClass() {
		String resultado = ImcCalculator.calculate(88.0, 1.77); // 28.08
		Assert.assertEquals("Sobrepeso", resultado);
	}

	// Vamos garantir os valores limitrofes (superior)

	@Test
	public void shouldCalculateMaxAtMagrezaLayer() {
		String resultado = ImcCalculator.calculate(57.92, 1.77);
		Assert.assertEquals("Magreza", resultado);
	}

	@Test
	public void shouldCalculateMaxAtNormalLayer() {
		String resultado = ImcCalculator.calculate(77.97, 1.77);
		Assert.assertEquals("Normal", resultado);
	}

	@Test
	public void shouldCalculateMaxAtSobrepesoLayer() {
		String resultado = ImcCalculator.calculate(93.98, 1.77);
		Assert.assertEquals("Sobrepeso", resultado);
	}

	@Test
	public void shouldCalculateMaxAtObesidadeLayer() {
		String resultado = ImcCalculator.calculate(94.00, 1.77);
		Assert.assertEquals("Obesidade", resultado);
	}
}
