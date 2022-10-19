package exercicio05prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventoRepository<?> {
	
	private static Map<String, ?> items = new HashMap<>();

	public static boolean add(? evento) {
		if (exists(evento))
			return false;

		try {
			items.put(evento.getTitulo(), evento);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static ? get(String titulo) {
		return items.getOrDefault(titulo, null);
	}

	public static boolean update(? evento) {
		if (!exists(evento))
			return false;

		try {
			items.put(evento.getTitulo(), evento);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean exists(? evento) {
		return items.containsKey(evento.getTitulo());
	}

	public static ArrayList<?> getAll() {
		return new ArrayList<?>(items.values());
	}
}
