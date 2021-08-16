package builder;

import model.Violao;
/**
 * 
 * @author Dione
 *
 */
public class FabricaViolaoBuilder {
	
	// Obrigatório
	private String corda;

	// Opicionais
	private String preco;
	private String cor;
	private String modelo;
	private String braco;
	private String tarraxa;
	private String material;

	public FabricaViolaoBuilder(String corda) {
		this.corda = corda;

	}

	public FabricaViolaoBuilder andModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public FabricaViolaoBuilder forPreco(String preco) {
		this.preco = preco;
		return this;
	}

	public FabricaViolaoBuilder andCor(String cor) {
		this.cor = cor;
		return this;
	}

	public FabricaViolaoBuilder andBraco(String braco) {
		this.braco = braco;
		return this;
	}

	public FabricaViolaoBuilder andTarraxa(String tarraxa) {
		this.tarraxa = tarraxa;
		return this;
	}

	public FabricaViolaoBuilder andMaterial(String material) {
		this.material = material;
		return this;
	}

	public Violao thatsAll() {
		return new Violao(modelo, preco, cor, corda, braco, tarraxa, material);
	}
}
