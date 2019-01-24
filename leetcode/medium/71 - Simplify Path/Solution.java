class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        ArrayDeque<String> location = new ArrayDeque<String>();
        
        for(String pathElement : pathArray) {
            switch(pathElement){
                case ".":
                    break;
                case "..":
                    if(location.peekLast() != null){
                        location.removeLast();
                    }
                    break;
                case "":
                    break;
                default:
                    location.addLast(pathElement);
            }
        }
        
        String simplePath = "/";
        simplePath += String.join("/", location);
        
        return simplePath;
    }
}