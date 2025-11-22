package theater;

/**
 * Class that represents a play which can be performed.
 *
 * <p>This object stores the name and type of the play.
 * Neither field should ever be {@code null}. Hence, callers also need to provide
 * non-null values when creating a play.</p>
 */
public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
