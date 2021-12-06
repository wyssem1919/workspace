package iset.sem31.tp3;

public class Analyseur3 {
    private String message =null;
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    //Retourner "SUCCES" si le message contient le mot "succès",sinon retourner "ECHEC"
    public String analyserSucces ()
    {
        if (message.toLowerCase().contains("succès"))
            return "SUCCES";
        else
            return "ECHEC";
    }
    //Retourner true si la taille minimale du message est 5 et la taille maximale est 10
    public boolean estValide()
    {
        if (message.length()>5 && message.length()<=10)
        {
            return true;
        }
        return false;
    }

}
