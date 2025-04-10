package edu.odu.cs.cs330.items.creation;

import edu.odu.cs.cs330.items.Item;
import edu.odu.cs.cs330.items.Tool;


@SuppressWarnings({
    "PMD.AtLeastOneConstructor"
})
public class ToolCreation implements ItemCreationStrategy
{
    /**
     * Convenience wrapper to mirror the Rust new-returns-a-builder pattern.
     * Use "create" since "new" is a reserved keyword in Java.
     */
    public static ToolCreation construct()
    {
        return new ToolCreation();
    }

    @Override
    public Item fromDefaults()
    {
        // Return a **Default** Tool
        return new Tool();
    }

    @Override
    public int requiredNumberOfValues()
    {
        // Replace the return value;
        return 6;
    }

    @SuppressWarnings({
        "PMD.LawOfDemeter",
        "PMD.LocalVariableCouldBeFinal"
    })
    @Override
    public Item fromTokens(final String... tokens)
    {
        Tool tool = new Tool();

        tool.setName(tokens[0]);
        // Set the remaining attributes
        tool.setMaterial(tokens[1]); //material
        tool.setDurability(Integer.parseInt(tokens[2]));//durability
        //speed 
        //modifier 
        //modiefier level 
        return tool;
    }

    @Override
    public Item fromExisting(final Item original)
    {
        // Return a clone of original
        return null;
    }
}
