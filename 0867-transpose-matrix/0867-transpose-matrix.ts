function transpose(matrix: number[][]): number[][] {
    const m: number = matrix.length;
    const n: number = matrix[0].length;
    const mainArr: number[][] = [];
    for (let i: number = 0; i < n; i++) {
        const tempArr: number[] = [];
        for (let j: number = 0; j < m; j++) {
            tempArr.push(matrix[j][i]);
        }
        mainArr.push(tempArr);
    }
    return mainArr;
};