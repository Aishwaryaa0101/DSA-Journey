class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int repeated=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==2){
                repeated=entry.getKey();
            }
        }
        int missing=0;
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!map.containsKey(i)){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}