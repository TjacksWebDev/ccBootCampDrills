package lrn.cc.drill.lesson;

import java.io.StringWriter;
import java.util.List;

import com.coderscampus.generator.domain.GenMeta;
import com.coderscampus.generator.service.GenBase;
import com.coderscampus.generator.util.Names;

public class U5L03 extends GenBase {
	
	public U5L03(GenMeta genMeta) {
		super(genMeta);
	}

    @Override
    public StringWriter generate(StringWriter stringWriter) {
        this.context.put("one", Names.randomName().toLowerCase());
        this.context.put("two", Names.randomName().toLowerCase());
        this.context.put("three", Names.randomName().toLowerCase());
        this.context.put("four", Names.randomName().toLowerCase());
        this.context.put("five", Names.randomName().toLowerCase());
        this.context.put("six", Names.randomName().toLowerCase());
        this.context.put("seven", Names.randomName().toLowerCase());
        this.context.put("eight", Names.randomName().toLowerCase());
        this.context.put("ClassName", this.genMetaList.get(defaultPosition).getName());
        this.context.put("package", this.genMetaList.get(defaultPosition).getPakage());
        merge( null);
        write();
        return writer;
    }

    public void write(){
        this.writeJava(writer.toString());
    }
}
