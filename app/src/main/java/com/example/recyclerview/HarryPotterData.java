package com.example.recyclerview;

import java.util.ArrayList;

public class HarryPotterData {
    private static String[] name = {
            "Daniel Jacob Radcliffe",
            "Emma Watson",
            "Tom Felton",
            "Rupert Grint",
            "Alan Rickman",
            "Bonnie Wright",
            "Matthew Lewis",
            "Richard Harris",
            "Helena Bonham Carter",
            "Robbie Coltrane",
            "Ralph Fiennes"
    };
    private static String[] karakter = {
            "Harry Potter",
            "Hermione Granger",
            "Draco Malfoy",
            "Ron Weasly",
            "Severus Snape",
            "Ginny Weasley",
            "Neville Longbottom",
            "Albus Dumbledore",
            "Bellatrix Lestrange",
            "Rubeus Hagrid",
            "Lord Voldemort"
    };

    private static String[] details = {
            "Harry James Potter adalah seorang karakter penyihir fiktif yang merupakan protagonis dalam serial Harry Potter. Harry Potter adalah penyihir berdarah-campuran, ibunya Lily Evans adalah kelahiran muggle dan ayahnya James Potter adalah penyihir berdarah-murni, kedua orang tuanya telah meninggal karena dibunuh oleh Lord Voldemort ketika Harry masih bayi.",
            "Hermione Jean Granger adalah sebuah tokoh fiksi karangan J.K. Rowling dalam seri Harry Potter. Karakternya dalam film diperankan oleh Emma Watson. Hermione termasuk seorang murid yang terpilih di asrama Gryffindor di Sekolah Sihir Hogwarts dan merupakan sahabat terbaik Harry Potter dan Ron Weasley.Hermione menunjukkan kemampuan akademis yang lebih bila dibandingkan dengan sahabat dan teman sekelasnya walaupun ia kurang memiliki kematangan emosional. ",
            "Draco Malfoy adalah karakter fiksi dalam seri Harry Potter karangan J.K. Rowling.Dia adalah seorang siswa di tahun Harry Potter, menempati asrama Slytherin. Dia sering ditemani oleh dua sahabatnya, Vincent Crabbe dan Gregory Goyle, yang bertindak sebagai kaki tangannya. Draco dicirikan sebagai pengganggu pengecut yang memanipulasi dan menyakiti orang untuk mendapatkan apa yang dia inginkan; namun, dia adalah pengguna sihir yang licik. Dia diperankan oleh Tom Felton dalam seri film Harry Potter.",
            "Ron Weasley adalah penyihir berdarah murni Inggris, Ron mulai menghadiri Sekolah Sihir dan Penyihir Hogwarts pada tahun 1991 dan diseleksi ke Asrama Gryffindor. Dia segera menjadi teman dekat dengan sesama siswa Harry Potter dan kemudian Hermione Granger. ",
            "Severus Snape adalah seorang penyihir berdarah Inggrisyang menjabat sebagai Guru Ramuan, profesor Pertahanan Terhadap Ilmu Hitam, dan Kepala Sekolah dari Sekolah Sihir Hogwarts dan Ilmu Sihir serta anggota Ordo Phoenix dan Pelahap Maut. Kehidupan gandanya memainkan peran yang sangat penting dalam kedua Perang Penyihir melawan Voldemort.",
            "Ginny Weasley adalah seorang tokoh fiksi di buku cerita berseri Harry Potter. Dia adalah anak paling bungsu dari tujuh bersaudara di keluarga Arthur Weasley dan Molly Weasley, dan juga satu-satunya anak perempuan mereka. Ginny Weasley memiliki perawakan kecil, dengan rambut merah menyala (turun-temurun dalam keluarga Weasley) dan juga berbola mata kecokelatan.",
            "Neville adalah murid Hogwarts yang ditempatkan di Asrama Gryffindor, dan memiliki ingatan yang parah sekali dan merupakan murid tersial, terutama pada 3 episode awal. Neville berbagi kamar tidur dengan Harry Potter, Ron Weasley, Seamus Finnigan dan Dean Thomas.",
            "Albus Percival Wulfric Brian Dumbledore merupakan salah satu tokoh dalam serial novel ciptaan J. K. Rowling sebagai Kepala Sekolah Sihir Hogwarts. Ia merupakan seorang ahli sihir yang bijaksana dan paling dihormati di dunia Sihir. Ia berperan sebagai pembimbing atau penasihat tokoh utama, Harry Potter sebagaimana konsep perwatakan Merlin atau Gandalf.",
            "Bellatrix Lestrange pada Film Harry Potter diperankan oleh Aktris asal Inggris Helena Bonham-Carter. Bella adalah putri sulung dari pasangan penyihir murni dari keluarga Black, Cygnus Black dan istrinya Druella Black ( Terlahir Rosier ).",
            "Rubeus Hagrid (atau lebih dikenal sebagai Hagrid) adalah tokoh fiksi dalam seri Harry Potter karya J. K. Rowling. Hagrid adalah pengawas hewan liar di Sekolah Sihir Hogwarts dan belakangan diangkat sebagai Guru Pemeliharaan Satwa Gaib sebagai tambahan atas tugas-tugasnya.",
            "Voldemort digambarkan sebagai tokoh yang sangat jahat, kejam, licik, menghalalkan segala cara untuk mencapai tujuannya. Voldemort kerap disebut sebagai 'Kau-Tahu-Siapa', 'Pangeran Kegelapan', atau 'Dia Yang Namanya Tak Boleh Disebut'"

    };

    private static int[] images = {
            R.drawable.harrypotter,
            R.drawable.hermione,
            R.drawable.draco,
            R.drawable.ron,
            R.drawable.snape,
            R.drawable.ginny_weasley,
            R.drawable.neville,
            R.drawable.albus,
            R.drawable.bellatrix,
            R.drawable.hagrid,
            R.drawable.voldemort
    };

    static ArrayList<HarryPotter> getListData() {
        ArrayList<HarryPotter> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            HarryPotter harryPotter = new HarryPotter();
            harryPotter.setName(name[position]);
            harryPotter.setKarakter(karakter[position]);
            harryPotter.setDetail(details[position]);
            harryPotter.setPhoto(images[position]);
            list.add(harryPotter);
        }
        return list;
    }
}
