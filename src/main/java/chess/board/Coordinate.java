package chess.board;

import java.util.Objects;

public final class Coordinate {

    private final Rank rank;
    private final File file;

    public Coordinate(final Rank rank, final File file) {
        this.rank = rank;
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return rank == that.rank && file == that.file;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, file);
    }
}
