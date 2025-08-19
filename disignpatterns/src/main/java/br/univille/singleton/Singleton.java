public class Singleton {
    //variavel global que guarda a instancia
    //do singleton
    //e que é inicializada na primeira vez que o método getInstance é chamado
    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar instanciamento externo
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

}
