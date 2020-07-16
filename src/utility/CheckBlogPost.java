package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {
	String[] badWord = { "arse", "arsehole", "aryan", "ass", "ass fuck", "ass hole", "assbag", "assbandit", "assbang",
			"assbanged", "assbanger", "assbangs", "assbite", "assclown", "asscock", "asscracker", "asses", "assface",
			"assfaces", "assfucker", "assfukka", "assgoblin", "b!tch", "b00bs" };

	public boolean checkBlog(Blog blog) {
		if (checkBlogTitle(blog) || checkBlogDescription(blog)) {
			return false;
		}
		return true;
	}

	public boolean checkBlogTitle(Blog blog) {
		String title = blog.getBlogTitle();
		for (int i = 0; i < badWord.length; i++) {
			if (title.equalsIgnoreCase(badWord[i])) {
				return true;
			}
		}
		return false;

	}

	public boolean checkBlogDescription(Blog blog) {
		String des = blog.getBlogDescription();
		for (int i = 0; i < badWord.length; i++) {
			if (des.equalsIgnoreCase(badWord[i])) {
				return true;
			}
		}

		return false;
	}

}