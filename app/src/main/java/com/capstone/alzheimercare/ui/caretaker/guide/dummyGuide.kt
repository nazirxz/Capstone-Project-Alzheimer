package com.capstone.alzheimercare.ui.caretaker.guide

import com.capstone.alzheimercare.R

object dummyGuide {
    private val guideTypes = arrayOf("Panduan Tepat Merawat Orang dengan Penyakit Alzheimer",
        "10 gejala awal Demensia Alzheimer")

    private const val guideDescription1 = "Penyakit Alzheimer yang merupakan jenis demensia paling umum. Pada awalnya, penyakit menyerang sel-sel otak dan seiring waktu sel-sel " +
            "tersebut akan mati. Kondisi ini menimbulkan penurunan kemampuan seseorang untuk berpikir, berperilaku, dan berbahasa.Bagi Anda yang memiliki anggota keluarga dengan kondisi ini, " +
            "menghadapi mereka tentu bukanlah tugas yang mudah. Padahal perawatan di rumah dapat membantu pasien memiliki kualitas hidup yang lebih baik. Anda tidak perlu khawatir, simak " +
            "panduan perawatan penderita Alzheimer di bawah ini." +
            "\n1. Perhatikan pola makan untuk penderita Alzheimer\n" +
            "Gejala Alzheimer, yakni suka lupa dapat membuat pasien tidak makan dan minum dengan benar. Ditambah dengan gejala lain yang menyertai, " +
            "seperti kesulitan bergerak dan kemampuan melihat menurun membuat pasien susah untuk mendapatkan asupan gizi dengan benar.\n" +
            "2. Tingkatkan komunikasi dengan cara yang tepat\n" +
            "Pasien penyakit Alzheimer cenderung sulit untuk berkomunikasi. Entah mereka berbicara terbata-bata, " +
            "sulit menyebutkan benda atau kata yang ingin dibicarakan, atau terus mengulang-ulang pertanyaan yang sama. " +
            "Menghadapi pasien dengan gejala ini, tentu menjadi tantangan bagi Anda.\n" +
            "\n" +
            "Nah, perawatan yang tepat untuk penderita dengan gejala Alzheimer ini adalah mengikuti terapi wicara. " +
            "Tidak mengandalkan terapis, sebenarnya perawatan ini juga bisa dilakukan di rumah. Caranya adalah dengan meningkatkan komunikasi dengan pasien."

    private const val guideDescription2 = "Demensia Alzheimer atau lebih dikenal dengan Alzheimer merupakan salah satu bagian dari demensia yang paling banyak ditemui. Sekitar 60-70 persen dari kasus demensia atau pikun merupakan Alzheimer.\n" +
            "\n" +
            "Orang dengan Alzheimer mengalami penurunan fungsi otak termasuk fungsi kognitif yang meliputi kemampuan daya ingat, berbahasa, fungsi visuospatial dan fungsi eksekutif ODD " +
            "menurun. Penyakit yang dapat menyebabkan kematian ini hanya bisa diperlambat perkembangannya melalui obat-obatan namun tidak bisa disembuhkan secara total." +
            "1.Gangguan Daya Ingat\n" +
            "2.Sulit Fokus\n" +
            "3.Sulit Melakukan Kegiatan yang Familiar\n" +
            "4.Disorientasi\n" +
            "5.Kesulitan Memahami Visuospasial\n" +
            "6.Gangguan Komunikasi\n" +
            "7.Menaruh Barang Tidak Pada Tempatnya\n" +
            "8.Salah Membuat Keputusan\n" +
            "9.Menarik Diri Dari Pergaulan\n" +
            "10.Perubahan Perilaku dan Kepribadian\n"
    private val guideDescriptions = arrayOf(
        guideDescription1,
        guideDescription2)

    private val guideImages = arrayOf<Int>(R.drawable.ic_guide_image,
        R.drawable.gejalaawal)

    val listData: ArrayList<DataClassGuide>
        get() {
            val list = arrayListOf<DataClassGuide>()
                        for (position in guideTypes.indices) {
                val name = DataClassGuide("","")
                name.guideName = guideTypes[position]
                name.description = guideDescriptions[position]
                name.image = guideImages[position]
                list.add(name)
            }
            return list
        }
}
