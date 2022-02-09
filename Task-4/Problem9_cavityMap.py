def cavityMap(grid):
    n=len(grid)
    for r in range(n):
        for c in range(len(grid[0])):
            if r == 0 or r== n-1 or c==0 or c==len(grid[0])-1 :
                continue
            else:
                if grid[r][c]>max (grid[r][c+1] ,grid[r][c-1] ,grid[r-1][c] ,grid[r+1][c]):
                    grid[r][c]='X'
    for i in range(n):
        print("".join(grid[i]))

if __name__ == '__main__':
    n=int(input())
    grid=[]
    for i in range(n):
        num=str(input())
        grid.append([str(x) for x in str(num)])
cavityMap(grid)