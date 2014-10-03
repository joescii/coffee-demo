ns = [-3, -2, -1, 0, 1, 2, 3, 4]
square = (n) -> n * n

# for the win!


describe 'positive squares', ->
  it 'should work', ->
    expect(squares)
    .toEqual([1,4,9,16])