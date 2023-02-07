interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return l * b;
    }

    @Override
    public double perimeter() {
        return 2 * (l + b);
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Circle implements Shape {
    double radius;
    final double PI = 22.0 / 7;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}

class ComputeParams {
    static void computeParams(Shape shape) {
        System.out.printf("%.2f %.2f\n", shape.area(), shape.perimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char type = sc.next().charAt(0);
            if (type == 'R') {
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                shapes.add(new Rectangle(l, b));
            } else if (type == 'S') {
                double side = sc.nextDouble();
                shapes.add(new Square(side));
            } else if (type == 'C') {
                double radius = sc.nextDouble();
                shapes.add(new Circle(radius));
            }
        }

        for (Shape shape : shapes) {
            ComputeParams.computeParams(shape);
        }
    }
}
