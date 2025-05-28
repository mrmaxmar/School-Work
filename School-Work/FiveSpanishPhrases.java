public class FiveSpanishPhrases
{
	public static void main(String[] args) {
    
    String[] español = {"Hola", "¿Comó estas?", "Me llamo Yaphet", "Estoy aprendiendo español", "Hasta luego"};
    String[] translation = {"Hello", "How are you?", "My name is Yaphet", "I am learning Spanish", "See you later."};
    for(int i = 0; i < español.length; i++){
        System.out.println(español[i] + " - "+ translation[i]);
    }
    
	}
}
