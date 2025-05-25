package TrabajoPracticoN3.Ejercicio3;

public class ProcesamientoTweets {

    public static boolean esValido(String tweet) {
        return tweet.length() <= 280;
    }

    public static String agregarHashtag(String tweet, String hashtag) {
        return tweet + " " + hashtag;
    }

    public static String extraerUsuario(String tweet) {
        int pos = tweet.indexOf("@");
        if (pos != -1) {
            int fin = tweet.indexOf(" ", pos); // Busca espacio después del @
            return (fin != -1) ? tweet.substring(pos, fin) : tweet.substring(pos);
        }
        return "Usuario no encontrado";
    }

    public static String construirTweet(String parte1, String parte2, String parte3) {
        StringBuilder sb = new StringBuilder();
        sb.append(parte1).append(" ").append(parte2).append(" ").append(parte3);
        return sb.toString();
    }

    public static void main(String[] args) {
        String tweetOriginal = "@usuario Hoy es un gran día para programar en Java!";
        System.out.println("Tweet válido: " + esValido(tweetOriginal));

        String tweetConHashtag = agregarHashtag(tweetOriginal, "#JavaRocks");
        System.out.println("Tweet con hashtag: " + tweetConHashtag);

        String usuario = extraerUsuario(tweetOriginal);
        System.out.println("Usuario extraído: " + usuario);

        String nuevoTweet = construirTweet("Programar", "es divertido", "#CodeLife");
        System.out.println("Tweet construido: " + nuevoTweet);
    }
}
