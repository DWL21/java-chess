package chess;

import java.util.Objects;

public class Position {
    private final Rank rank;
    private final File file;

    public Position(Rank rank, File file) {
        this.rank = rank;
        this.file = file;
    }

    public int getFile() {
        return file.getFile();
    }

    public int getRank() {
        return rank.getRank();
    }

    @Override
    public boolean equals(Object obj) {
        Position that = (Position) obj;
        return this.rank == that.rank && this.file == that.file;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, file);
    }
}