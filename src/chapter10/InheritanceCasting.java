package chapter10;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting casting = new InheritanceCasting();
        casting.objectCastArray();
    }

    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCastArray() {
        ParentCasting[] parents = new ParentCasting[3];
        parents[0] = new ChildCasting();
        parents[1] = new ParentCasting();
        parents[2] = new ChildCasting();
        objectTypeCheck(parents);
    }

    private void objectTypeCheck(ParentCasting[] parents) {
        for(ParentCasting parent : parents) {
            if(parent instanceof ChildCasting) {
                System.out.println("ChildCasting");
                ChildCasting child = (ChildCasting) parent;
                child.printAge();
            } else if(parent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }
}
