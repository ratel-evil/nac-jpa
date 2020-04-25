package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ContratoDAO;
import br.com.fiap.dao.enums.TipoContrato;
import br.com.fiap.dao.enums.TipoImovel;
import br.com.fiap.dao.enums.TipoLogradouro;
import br.com.fiap.dao.impl.ContratoDAOImpl;
import br.com.fiap.entity.Contrato;
import br.com.fiap.entity.Corretor;
import br.com.fiap.entity.Corretora;
import br.com.fiap.entity.Endereco;
import br.com.fiap.entity.Imovel;
import br.com.fiap.entity.Usuario;
import br.com.fiap.singleton.EntityMFSingleton;

public class View {

	
	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityMFSingleton.getInstance(); 
		EntityManager em = fabrica.createEntityManager();
		
		
		ContratoDAO dao = new ContratoDAOImpl(em);
		
		
		Endereco endereco = new Endereco();
		
		endereco.setBairro("Vila olimpia");
		endereco.setCep("0486355");
		endereco.setCidade("Sao Paulo");
		endereco.setComplemento("Apartamento");
		endereco.setLogradouro("Rua");
		endereco.setNumero(666);
		endereco.setUf("SP");
		endereco.setTipo(TipoLogradouro.RUA);
		
		Usuario usuario = new Usuario();
		usuario.setCpf("45304464548");
		usuario.setEmail("thyago@gmail.com");
		usuario.setNome("Thyago");
		usuario.setTelefone("119658014456");
		
		List<Endereco> enderecos = new ArrayList<Endereco>();
		
		enderecos.add(endereco);
		
		usuario.setEndereco(enderecos);
		
		Corretora corretora = new Corretora();
		
		corretora.setCnpj("00454/888-0001");
		corretora.setEmail("RatelCorretora@gmail.com");
		corretora.setNomeFantasia("Ratel - Corretora de qualidade");
		corretora.setRazaoSocial("ratel corretoria ME");
		corretora.setTelefone("11958789964");
		
		Corretor corretor = new Corretor();
		
		corretor.setCorretora(corretora);
		corretor.setCpf("45877789885");
		corretor.setEmail("fabio@gmail.com");
		corretor.setNomeCorretor("Fabio Brazza");
		corretor.setTelefone("11958789985");
		
		Imovel imovel = new Imovel();
		imovel.setArea(66.6);
		imovel.setEndereco(endereco);
		imovel.setNumeroBanheiros(2);
		imovel.setNumeroQuartos(3);
		imovel.setTipoImovel(TipoImovel.APARTAMENTO);
		imovel.setValor(4000);
		
		Contrato contrato = new Contrato();
		contrato.setCorretor(corretor);
		contrato.setDataAbertura(new GregorianCalendar().getInstance());
		contrato.setDataFechamento(new GregorianCalendar(2021, Calendar.APRIL, 26));
		contrato.setImovel(imovel);
		contrato.setTipoContrato(TipoContrato.LOCACAO);
		contrato.setUsuario(usuario);

		dao.cadastrar(contrato);

		try {
			dao.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
