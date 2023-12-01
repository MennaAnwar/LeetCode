function arrayStringsAreEqual(word1: string[], word2: string[]): boolean {
        return word1.toString().replaceAll(',', '') === word2.toString().replaceAll(',', '') ? true : false

};
