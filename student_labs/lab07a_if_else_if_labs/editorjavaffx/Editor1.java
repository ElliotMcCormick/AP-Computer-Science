package lab07a_if_else_if_labs.editorjavaffx;

public class Editor1 implements Ed {

    private String pre, post;

    public Editor1(String before, String after) {
        pre = before;
        post = after;
    }

    public String toString() {
        return pre + "||" + post;
    }

    public String getBefore() {
        return pre;
    }

    public String getAfter() {
        return post;
    }

    public Editor1 rightArrow() {
        if (post.length() < 1) {
            return new Editor1(pre, post);
        } else {
            return new Editor1(pre + post.substring(0, 1), post.substring(1));
        }
    }

    public Ed leftArrow() {
        if (pre.length() < 1) {
            return new Editor1(pre, post);
        } else {
            return new Editor1(pre.substring(0, pre.length() - 1), pre.substring(pre.length() - 1) + post);
        }
    }

    public Ed delete() {
        if (post.length() < 1) {
            return new Editor1(pre, post);
        } else {
            return new Editor1(pre, post.substring(1));
        }
    }

    public Ed backspace() {
        if (pre.length() < 1) {
            return new Editor1(pre, post);
        } else {
            return new Editor1(pre.substring(0, pre.length() - 1), post);
        }
    }

    public Ed insertString(char c) // Originally insert(char c), which is fine if you teach the char type
    {
        return new Editor1(pre + c, post);
    }

    public Ed homeKey() {
        return new Editor1("", pre + post);
    }

    public Ed endKey() {
        return new Editor1(pre + post, "");
    }
    
    public Ed space() {
        return new Editor1(pre + " ", post);
    }

    public static void main(String[] args) {
        Editor1 eddie = new Editor1("big", "dog");
        System.out.println(eddie + " right arrow = " + eddie.rightArrow());
        System.out.println(eddie + " left arrow = " + eddie.leftArrow());
    }
}
