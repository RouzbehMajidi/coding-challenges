class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> emailSet = new HashSet<String>();
        
        for(String email : emails){
            String localName = email.substring(0, email.indexOf('@'));
            String domainName = email.substring(email.indexOf('@'), email.length());
            
            localName = localName.replace(".", "");
            localName = localName.substring(0, localName.indexOf('+'));
            
            String filteredEmail = localName + domainName;
            emailSet.add(filteredEmail);
        }
        
        return emailSet.size();
        
    }
}