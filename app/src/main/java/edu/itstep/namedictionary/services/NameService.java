package edu.itstep.namedictionary.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.itstep.namedictionary.entities.Name;

@RequiresApi(api = Build.VERSION_CODES.N)
public class NameService {
    private static final String FIRST_NAME = "Bonifatius";
    private static final String SECOND_NAME = "Silke";
    private static final String THIRD_NAME = "Hilaria";

    private static final String FIRST_NAME_DAY_DATE = "14 May";
    private static final String SECOND_NAME_DAY_DATE = "1 June";
    private static final String THIRD_NAME_DAY_DATE = "12 August";

    private static final String FIRST_NAME_DEFINITION =
            "This name comes from the Latin \"bŏnus\" (honorable, virtuous, valiant, " +
            "gallant, valorous, courageous, manful) plus \"fātum\" " +
            "(oracle, prophecy, prediction, fairies, destiny, destiny of men, lifetime determined by you). " +
            "The name means “the fated valiant man, " +
            "the destiny of honorable man”. Saint Boniface was a missionary who propagated " +
            "Christianity in the Frankish Empire during the 8th century. " +
            "He is the patron saint of Germany and the first archbishop of Mainz. He was killed in Frisia.";
    private static final String SECOND_NAME_DEFINITION =
            "Silke is a Germanic female given name originally derived from Latin. " +
            "There are two separate meanings: Silke is a Frisian diminutive form of Cecilia, " +
            "from the Roman family name Caecilius. Silke is also a German diminutive form of Celia, " +
            "meaning \"heavenly\", from the Latin \"caelum\" meaning \"heaven\".";
    private static final String THIRD_NAME_DEFINITION =
            "Hilaria is Latin Girl name which means - \"Humorous; Happy; Cheerful; Joyful\"\n" +
            "According to the numerology value 4, Hilaria is Stable, Calm, home loving, detail oriented, " +
            "obedient, trustworthy, logical, active, organized, responsible and trustworthy." +
            "Name Hilaria is usually blessed with amazing management skills. Hilaria is very good " +
            "at summarizing the scattered documents, tackling complicated situations and handling " +
            "problems with patience. You can't dispute or argue with Hilaria thanks to the " +
            "super reasoning power Hilaria has.";


    public static ArrayList<Name> getNameList() {
        ArrayList<Name> names = new ArrayList<>();

        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));
        names.add(new Name(FIRST_NAME, FIRST_NAME_DAY_DATE, FIRST_NAME_DEFINITION));
        names.add(new Name(SECOND_NAME, SECOND_NAME_DAY_DATE, SECOND_NAME_DEFINITION));
        names.add(new Name(THIRD_NAME, THIRD_NAME_DAY_DATE, THIRD_NAME_DEFINITION));

        return names;
    }

    public static ArrayList<String> getNames() {
        List<String> names = getNameList()
                .stream()
                .map(Name::getName)
                .collect(Collectors.toList());

        return (ArrayList<String>) names;
    }
}
