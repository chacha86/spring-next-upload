package com.example.upload.domain.post.genFile.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostGenFile is a Querydsl query type for PostGenFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostGenFile extends EntityPathBase<PostGenFile> {

    private static final long serialVersionUID = -973297149L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostGenFile postGenFile = new QPostGenFile("postGenFile");

    public final com.example.upload.domain.base.genFile.genFile.entity.QGenFile _super = new com.example.upload.domain.base.genFile.genFile.entity.QGenFile(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath downloadUrl = _super.downloadUrl;

    //inherited
    public final StringPath fileDateDir = _super.fileDateDir;

    //inherited
    public final StringPath fileExt = _super.fileExt;

    //inherited
    public final StringPath fileExtType2Code = _super.fileExtType2Code;

    //inherited
    public final StringPath fileExtTypeCode = _super.fileExtTypeCode;

    //inherited
    public final StringPath fileName = _super.fileName;

    //inherited
    public final NumberPath<Integer> fileNo = _super.fileNo;

    //inherited
    public final StringPath filePath = _super.filePath;

    //inherited
    public final NumberPath<Long> fileSize = _super.fileSize;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath metadata = _super.metadata;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    //inherited
    public final StringPath originalFileName = _super.originalFileName;

    //inherited
    public final NumberPath<Long> ownerModelId = _super.ownerModelId;

    //inherited
    public final StringPath ownerModelName = _super.ownerModelName;

    public final com.example.upload.domain.post.post.entity.QPost post;

    //inherited
    public final StringPath publicUrl = _super.publicUrl;

    public final EnumPath<PostGenFile.TypeCode> typeCode = createEnum("typeCode", PostGenFile.TypeCode.class);

    //inherited
    public final StringPath typeCodeAsStr = _super.typeCodeAsStr;

    public QPostGenFile(String variable) {
        this(PostGenFile.class, forVariable(variable), INITS);
    }

    public QPostGenFile(Path<? extends PostGenFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostGenFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostGenFile(PathMetadata metadata, PathInits inits) {
        this(PostGenFile.class, metadata, inits);
    }

    public QPostGenFile(Class<? extends PostGenFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.post = inits.isInitialized("post") ? new com.example.upload.domain.post.post.entity.QPost(forProperty("post"), inits.get("post")) : null;
    }

}

