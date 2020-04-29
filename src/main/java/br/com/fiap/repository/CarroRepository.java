package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.model.CarroModel;

public class CarroRepository {
	private static CarroRepository instance;
	private static Map<Long, CarroModel> carros;
	
	public static CarroRepository getInstance() {
		if(instance == null) {
			instance = new CarroRepository();
		}
		return instance;
	}
	
	private CarroRepository() {
		carros = new HashMap<Long, CarroModel>();
		carros.put(1L, new CarroModel(1L, "Volkswagen", "Golf", 2018, "1.4 TSI", "Flex", "Automatico", "12,6 km/l (G) 8,4 km/l (A)", 103800.00, "Modelo topo de linha, todos os opcionais disponíveis. Ar-condicionado, teto solar panorâmico, bancos com regulagem elétrica, direção elétrica, central multimídia, volante em couro com comandos de som, painel digital. Motor 1.4 turbo (150cv) e câmbio automático convencional de 6 velocidades, faróis full LED, rodas aro 17”."));
		carros.put(2L, new CarroModel(2L, "Volkswagen", "Polo", 2020, "1.0 TSI", "Flex", "Automatico", "12,6 km/l (G) 8,7 km/l (A)", 77000.00, "Veículo muito completo, opcionais do modelo: Rodas aro 17” e sistema de som Beats Audio. Ar-condicionado digital, motor 1.0 turbo (128cv), transmissão automática de 6 velocidades, direção elétrica, central multimídia, volante em couro com comandos de som, painel digital, bancos em couro, volante revestido em couro, 4 portas."));
		carros.put(3L, new CarroModel(3L, "Honda", "Civic", 2020, "1.5 Turbo", "Gasolina", "Automatico (CVT)", "13,1 km/l (G) ", 134900.00, "Veículo topo de linha, Bancos e volante em couro, Ar-condicionado dual-zone, teto solar, regulagem elétrica dos bancos e retrovisores externos, Faróis em LED com acendimento automático, freio de estacionamento elétrico, acionamento remoto do motor, motorização 1.5 turbo (173cv) e transmissão automática CVT."));
		carros.put(4L, new CarroModel(4L, "BMW", "320i Sport", 2020, "2.0 Turbo", "Gasolina", "Automatico", "11,8 km/l (G) ", 195950.00, "Veículo premium lançamento. Bancos esportivos e volante (com paddle shifts) em couro, Ar-condicionado dual-zone digital, regulagem elétrica dos bancos e retrovisores externos com memória, Faróis em LED com acendimento automático, freio de estacionamento elétrico, acionamento remoto do motor, motorização 2.0 turbo injeção direta (184cv) e transmissão automática de 8 velocidades."));
		carros.put(5L, new CarroModel(5L, "Audi", "A4", 2020, "2.0 Turbo", "Gasolina", "Automatizado (DSG)", "12,7 km/l (G) ", 120155.00, "Veículo premium. Bancos e volante em couro, Ar-condicionado dual-zone digital, regulagem elétrica dos bancos e retrovisores externos com memória, controle de cruzeiro adaptativo (semiautônomo), sensor de presença (Keyless), motorização 2.0 turbo (190cv) e transmissão automatizado de 7 velocidades e dupla embreagem (DSG)."));
		carros.put(6L, new CarroModel(6L, "Volkswagen", "Jetta", 2020, "1.4 TSI", "Flex", "Automatico", "12,4 km/l (G) 8,5 km/l (A)", 104818.00, "Modelo topo de linha, todos os opcionais disponíveis. Ar-condicionado digital dual zone, bancos com regulagem elétrica, direção elétrica, central multimídia, volante em couro com comandos de som, painel digital, sistema Start Stop, controle de cruzeiro adaptativo (semiautônomo), sensor de presença (Keyless), motor 1.4 turbo (150cv) e câmbio automático convencional de 6 velocidades, rodas aro 17”."));
	}
	
	public ArrayList<CarroModel> findAll(){
		return new ArrayList<CarroModel>(carros.values());
	}
	
	public void save(CarroModel carroModel) {
		Long newId = (long) (carros.size()+1);
		carroModel.setId(newId);
		carros.put(newId, carroModel);
	}
	
	public CarroModel findById(long id) {
		return carros.get(id);
	}
	
	public void update(CarroModel carroModel) {
		carros.put(carroModel.getId(), carroModel);
	}
	
	public void deleteById(long id) {
		carros.remove(id);
	}
	
}
