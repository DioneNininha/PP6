package model;

/**
 * 
 * @author Dione
 *
 */
public class Violao {

	private String modelo;
	private String preco;
	private String cor;
	private String corda;
	private String braco;
	private String tarraxa;
	private String material;

	public Violao(String modelo, String preco, String cor, String corda, String braco, String tarraxa,
			String material) {

		this.modelo = modelo;
		this.preco = preco;
		this.cor = cor;
		this.corda = corda;
		this.braco = braco;
		this.tarraxa = tarraxa;
		this.material = material;
	}

	// -----------modelo
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	// ---------------Pre�o

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	// -----------------Cor
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
//-----------------Corda

	public String getCorda() {
		return corda;
	}

	public void setCorda(String corda) {
		this.corda = corda;
	}

//-----------Bra�o
	public String getBraco() {
		return braco;
	}

	public void setBraco(String braco) {
		this.braco = braco;
	}

//---------------Tarraxa
	public String getTarraxa() {
		return tarraxa;
	}

	public void setTarraxa(String tarraxa) {
		this.tarraxa = tarraxa;
	}

	// -------------MaterialCorpo
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "\nViol�o [Modelo = " + modelo + ",  Pre�o = " + preco + ",  Cor = " + cor + ",  Tipo de corda = " + corda
				+ ", Tamanho do bra�o= " + braco + ",  Tipo de Tarrachas = " + tarraxa + ",  Tipo de material do corpo = "
				+ material + "]";
	}
}
