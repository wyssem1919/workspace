package iset.sem31.tp3;

public class Analyseur {
    //Retourner "SUCCES" si le message contient le mot "succès",sinon retourner
// "ECHEC"
    public String analyserSucces (String message)
    {
        if (message.contains("succès"))
            return "SUCCES";
        else
            return "ECHEC";
    }
    //Retourner true si la taille du message est comprise entre 5 et 10
    public boolean estValide(String message)
    {
        if (message.length()>5 && message.length()<10)
        {
            return true;
        }
        return false;
    }



}
