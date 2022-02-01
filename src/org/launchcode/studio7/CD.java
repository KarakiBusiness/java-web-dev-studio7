package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("wavelength of 780 nm");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
