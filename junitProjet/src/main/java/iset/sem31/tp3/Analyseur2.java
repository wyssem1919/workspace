package iset.sem31.tp3;

public class Analyseur2 {
    //Retourner "SUCCES" si le message contient le mot "succès", sinon retourner "ECHEC"

    public String analyserSucces(String message) {
        if (message.contains("succès"))
            return "SUCCES";
        else
            return "ECHEC";
    }

    //Retourner true si la taille minimale du message est 5
    // et la taille maximale est 10
    public boolean estValide(String message) {
        if (message.length() > 5 && message.length() < 10) {
            return true;
        }
        return false;

    }
}
