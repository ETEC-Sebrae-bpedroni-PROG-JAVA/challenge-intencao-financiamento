package br.gov.sp.etecsebrae.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etecsebrae.dto.Intencao;
import br.gov.sp.etecsebrae.entity.IntencaoEntity;
import br.gov.sp.etecsebrae.repository.IntencaoRepository;

@Service
public class IntencaoService {
	@Autowired
	private IntencaoRepository repository;

	public List<Intencao> getIntencoes() {
		List<IntencaoEntity> list = repository.findAll();
		return fromTo(list);
	}

	public Intencao getIntencao(int id) {
		IntencaoEntity entity = repository.getById(id);
		return fromTo(entity);
	}

	public Intencao saveIntencao(Intencao intencao) {
		IntencaoEntity entity = repository.save(fromTo(intencao));
		return fromTo(entity);
	}

	private Intencao fromTo(IntencaoEntity entity) {
		return new Intencao(entity.getId(), entity.getNomeCliente(), entity.getCpf(), entity.getRg(),
				entity.getDataNascimento(), entity.getEmail(), entity.getTelefoneResidencial(), entity.getTelefoneCelular(),
				entity.getEnderecoLogradouro(), entity.getEnderecoNumero(), entity.getEnderecoCidade(),
				entity.getEnderecoEstado(), entity.getEnderecoCep(), entity.getCategoriaFinanciamento(),
				entity.getQuantidadeParcelamento(), entity.getValorIntencao(), entity.getSalario());
	}

	private List<Intencao> fromTo(List<IntencaoEntity> list) {
		List<Intencao> intencoes = new ArrayList<Intencao>();
		for (IntencaoEntity entity : list) {
			intencoes.add(fromTo(entity));
		}
		return intencoes;
	}

	private IntencaoEntity fromTo(Intencao intencao) {
		return new IntencaoEntity(intencao.getId(), intencao.getNomeCliente(), intencao.getCpf(), intencao.getRg(),
				intencao.getDataNascimento(), intencao.getEmail(), intencao.getTelefoneResidencial(), intencao.getTelefoneCelular(),
				intencao.getEnderecoLogradouro(), intencao.getEnderecoNumero(), intencao.getEnderecoCidade(),
				intencao.getEnderecoEstado(), intencao.getEnderecoCep(), intencao.getCategoriaFinanciamento(),
				intencao.getQuantidadeParcelamento(), intencao.getValorIntencao(), intencao.getSalario());
	}
}
