class RnaTranscription {

    static String transcribe(String dnaStrand) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuffer rna = new StringBuffer();
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.substring(i, i + 1).equals("G")) rna.append("C");
            if (dnaStrand.substring(i, i + 1).equals("C")) rna.append("G");
            if (dnaStrand.substring(i, i + 1).equals("T")) rna.append("A");
            if (dnaStrand.substring(i, i + 1).equals("A")) rna.append("U");
        }
        return rna.toString();
    }
}
