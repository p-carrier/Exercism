public class Robot {

    private Orientation orientation;
    private GridPosition gridPosition;

    Robot(GridPosition initialGridPosition, Orientation initialOrientation) {
        this.orientation = initialOrientation;
        this.gridPosition = initialGridPosition;
    }

    Orientation getOrientation() {
        return orientation;
    }

    GridPosition getGridPosition() {
        return gridPosition;
    }

    void turnRight() {
        switch (orientation) {
            case EAST:
                orientation = Orientation.SOUTH;
                break;
            case WEST:
                orientation = Orientation.NORTH;
                break;
            case NORTH:
                orientation = Orientation.EAST;
                break;
            case SOUTH:
                orientation = Orientation.WEST;
                break;
            default:
                break;
        }
    }

    void turnLeft() {
        switch (orientation) {
            case EAST:
                orientation = Orientation.NORTH;
                break;
            case WEST:
                orientation = Orientation.SOUTH;
                break;
            case NORTH:
                orientation = Orientation.WEST;
                break;
            case SOUTH:
                orientation = Orientation.EAST;
                break;
            default:
                break;
        }
    }

    void advance() {
        switch (orientation) {
            case EAST:
                gridPosition = new GridPosition(gridPosition.x + 1, gridPosition.y);
                break;
            case WEST:
                gridPosition = new GridPosition(gridPosition.x - 1, gridPosition.y);
                break;
            case NORTH:
                gridPosition = new GridPosition(gridPosition.x, gridPosition.y + 1);
                break;
            case SOUTH:
                gridPosition = new GridPosition(gridPosition.x, gridPosition.y - 1);
                break;
            default:
                break;
        }
    }

    void simulate(String moves) {
        String[] path = moves.split("");
        for(int i = 0; i < path.length; i++) {
            switch (moves.charAt(i)) {
                case 'A':
                    advance();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                default:
                    break;
            }
        }
    }

}
