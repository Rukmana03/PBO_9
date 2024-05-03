public class method {
    
        public static void main(String[] args) {
            // String yang akan dijadikan contoh
            String text = "Hello, World!";
    
            // Menggunakan berbagai macam metode String
            System.out.println("Panjang string: " + text.length()); // String Length
            System.out.println("Substring dari indeks 7: " + text.substring(7)); // String Substring
            System.out.println("Karakter pada indeks 4: " + text.charAt(4)); // String charAt
            System.out.println("String dalam lowercase: " + text.toLowerCase()); // String toLowerCase
            System.out.println("String dalam uppercase: " + text.toUpperCase()); // String toUpperCase
            System.out.println("Mengganti 'World' dengan 'Java': " + text.replace("World", "Java")); // String replace
            System.out.println("Mengandung kata 'Hello': " + text.contains("Hello")); // String contains
            System.out.println("Apakah sama dengan 'Hello, World!': " + text.equals("Hello, World!")); // String equals
            System.out.println("Apakah sama dengan 'hello, world!': " + text.equalsIgnoreCase("hello, world!")); // String equalsIgnoreCase
            System.out.println("Apakah diakhiri dengan '!': " + text.endsWith("!")); // String endsWith
        }
    }
    