package com.senai.caua.PrjGame.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.senai.caua.PrjGame.entities.Jogo;
	import com.senai.caua.PrjGame.repositories.JogoRepository;

	@Service
	public class JogoService {

		private final JogoRepository jogoRepository;
		
		@Autowired
		public JogoService(JogoRepository jogoRepository) {
			this.jogoRepository = jogoRepository;
		}
		
		public Jogo getJogoById(Long id) {
			return jogoRepository.findById(id).orElse(null);
		}

		public List<Jogo> getAlljogos(){
			return jogoRepository.findAll();
		}
		public Jogo saveJogo(Jogo jogo) {
			return jogoRepository.save(jogo);
		}
		public void deleteJogo(Long id) {
			jogoRepository.deleteById(id);
		}
	}

