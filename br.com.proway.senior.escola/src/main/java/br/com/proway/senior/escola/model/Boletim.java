package br.com.proway.senior.escola.model;

import java.util.ArrayList;

public class Boletim {

	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public Double getMedia() {
		return media;
	}

	public ArrayList<Prova> getProvas() {
		return this.provas;
	}

	public void addProva(Prova prova) {
		this.provas.add(prova);
		calcularMedia();
	}

	public void removeProva(int index) throws Exception {

		if (index < 0) {
			throw new Exception("Utilizar apenas caracteres alfabéticos.");
		}
		this.provas.remove(index);
	}

	private void calcularMedia() {
		Double soma = 0.0;
		for (int i = 0; i < provas.size(); i++) {
			soma += provas.get(i).getNota();
		}this.media = soma /provas.size();
	}

	public void removeTodasProvas() {
		this.provas.removeAll(provas);
	}

}
