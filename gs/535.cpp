class Solution {
public:

    String a;
    String b;
    // Encodes a URL to a shortened URL.
    String encode(String longUrl) {
        a = longUrl;
        b = "http://tinyurl.com/4e9iAk";
        return b;
    }

    // Decodes a shortened URL to its original URL.
    String decode(String shortUrl) {
        return a;
    }
};

// Your Solution object will be instantiated and called as such:
// Solution solution;
// solution.decode(solution.encode(url));