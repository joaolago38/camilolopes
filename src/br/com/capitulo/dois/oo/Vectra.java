package br.com.capitulo.dois.oo;

public class Vectra extends Carro implements Som {
	Carro car = new Carro();
	Object o = car;
	Veiculo v = car;
	// nao da
	Veiculo v1 = new Veiculo();
//	Som s = v; som e sub de Vectra
//	Carro c = v; Carro e sub de veiculo
}
