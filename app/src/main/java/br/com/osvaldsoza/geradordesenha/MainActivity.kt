package br.com.osvaldsoza.geradordesenha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.osvaldsoza.geradordesenha.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val alfabeto = arrayOf(
        "A", "B", "C", "D", "E", "F", "G", "F",
        "I", "J", "K", "L", "M", "N", "O", "P",
        "R", "S", "T", "U", "V", "W", "Y", "Z "
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGerarSenha.setOnClickListener {
            gerarSenhaaleatoria()
        }
    }

    private fun gerarSenhaaleatoria() {
        val primeiraLetra = (alfabeto.indices).random()
        val segundaLetra = (alfabeto.indices).random()

        val letraAleatoria1 = alfabeto[primeiraLetra]
        val letraAleatoria2 = alfabeto[segundaLetra]

        val numerosAleatorios = Random()
        val numeros = numerosAleatorios.nextInt(9999)

        binding.txtSenha.text = "$letraAleatoria1$letraAleatoria2-$numeros"
    }
}