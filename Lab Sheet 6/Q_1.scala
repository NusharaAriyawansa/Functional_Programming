object Q_1 extends App {
    def caesar_encrypt(plain_text: String, shift: Int): String = {
        val encrypted_text = new StringBuilder
        for (char <- plain_text) {
            if (char.isLetter) {
                val is_upper = char.isUpper
                val char_code = char.toUpper.toInt
                val encrypted_code = (char_code - 65 + shift) % 26 + 65
                val encrypted_char = encrypted_code.toChar

                if (is_upper) {
                    encrypted_text.append(encrypted_char)
                } else {
                    encrypted_text.append(encrypted_char.toLower)
                }
            } else {
                encrypted_text.append(char)
            }
        }
        encrypted_text.toString
    }

    def caesar_decrypt(cipher_text: String, shift: Int): String = {
        caesar_encrypt(cipher_text, 26 -shift)
    }

    def caesar_cipher(text: String, shift: Int, operation: String): String = {
        if (operation == "encrypt") {
            caesar_encrypt(text, shift)
        } else if (operation == "decrypt") {
            caesar_decrypt(text, shift)
        } else {
            "Not valid"
        }
    }

    val plain_text = "Hello!"
    val shift_amount = 6

    // Encryption
    val encrypted_text = caesar_cipher(plain_text, shift_amount, "encrypt")
    println("Encrypted text: " + encrypted_text)

    // Decryption
    val decrypted_text = caesar_cipher(encrypted_text, shift_amount, "decrypt")
    println("Decrypted text: " + decrypted_text)
}
