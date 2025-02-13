
function cat(n) {
    if(n === 1) return 1;
    return n + cat(n + 1);
}


test('Test Arthurize.cat', () => {
        expect(cat(416)).toBe(86736);
        console.log('Test passed');
        console.log('', cat(1512))
});
