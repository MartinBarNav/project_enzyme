.class public final Lcom/saterskog/cell_lab/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/j$b;,
        Lcom/saterskog/cell_lab/j$a;
    }
.end annotation


# static fields
.field static a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/saterskog/cell_lab/j$a;",
            ">;"
        }
    .end annotation
.end field

.field static b:[Z

.field static c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 107
    sput-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    .line 108
    sput-object v0, Lcom/saterskog/cell_lab/j;->b:[Z

    .line 109
    sput-object v0, Lcom/saterskog/cell_lab/j;->c:[Ljava/lang/String;

    return-void
.end method

.method public static a(ILandroid/content/Context;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, -0x1

    .line 36
    .line 37
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move v1, v0

    move v2, v0

    .line 38
    :goto_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 39
    if-ne v2, p0, :cond_0

    .line 42
    :goto_1
    return v1

    .line 40
    :cond_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget v0, v0, Lcom/saterskog/cell_lab/j$a;->i:I

    if-ne v0, v3, :cond_2

    add-int/lit8 v0, v1, 0x1

    .line 38
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, v3

    .line 42
    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 46
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    .line 47
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 48
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    :goto_1
    return v1

    .line 47
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 50
    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method static a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/saterskog/cell_lab/j$a;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v13, 0x4

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x1

    const/4 v11, -0x1

    .line 111
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_33

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    .line 113
    new-instance v0, Lcom/saterskog/cell_lab/j$b;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/j$b;-><init>()V

    .line 118
    :try_start_0
    new-instance v0, Ljava/util/Scanner;

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v4, "levels.xml"

    invoke-virtual {v2, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    const-string v2, "\\A"

    invoke-virtual {v0, v2}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 125
    :goto_0
    invoke-static {v0}, Lcom/saterskog/cell_lab/j$b;->a(Ljava/lang/String;)Lorg/w3c/dom/Document;

    move-result-object v0

    .line 127
    const-string v2, "level"

    invoke-interface {v0, v2}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v5

    .line 129
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020008

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v6

    move v2, v3

    .line 130
    :goto_1
    invoke-interface {v5}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v0

    if-ge v2, v0, :cond_33

    .line 131
    new-instance v7, Lcom/saterskog/cell_lab/j$a;

    invoke-direct {v7}, Lcom/saterskog/cell_lab/j$a;-><init>()V

    .line 132
    invoke-interface {v5, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 133
    const-string v4, "id"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    .line 134
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    const-string v8, "tuto"

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 135
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->i:I

    :goto_2
    move v4, v3

    .line 147
    :goto_3
    sget-object v8, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v8, v8

    if-ge v4, v8, :cond_3

    .line 148
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "max-"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/saterskog/cell_lab/h;->values()[Lcom/saterskog/cell_lab/h;

    move-result-object v9

    aget-object v9, v9, v4

    invoke-virtual {v9}, Lcom/saterskog/cell_lab/h;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 149
    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_2

    .line 150
    :cond_0
    iget-object v8, v7, Lcom/saterskog/cell_lab/j$a;->k:[I

    aput v11, v8, v4

    .line 147
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 122
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v1

    goto/16 :goto_0

    .line 137
    :cond_1
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->i:I

    goto :goto_2

    .line 152
    :cond_2
    iget-object v9, v7, Lcom/saterskog/cell_lab/j$a;->k:[I

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aput v8, v9, v4

    goto :goto_4

    .line 154
    :cond_3
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x0

    aget-object v4, v6, v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->a:Ljava/lang/String;

    .line 156
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x1

    aget-object v4, v6, v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->c:Ljava/lang/String;

    .line 157
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x2

    aget-object v4, v6, v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->d:Ljava/lang/String;

    .line 158
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->d:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4

    iput-object v1, v7, Lcom/saterskog/cell_lab/j$a;->d:Ljava/lang/String;

    .line 159
    :cond_4
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x3

    aget-object v4, v6, v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->e:Ljava/lang/String;

    .line 160
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->e:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_5

    iput-object v1, v7, Lcom/saterskog/cell_lab/j$a;->e:Ljava/lang/String;

    .line 162
    :cond_5
    const-string v4, "file"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->f:Ljava/lang/String;

    .line 163
    const-string v4, "unlocks"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 164
    const-string v8, ","

    invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    .line 165
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    if-eqz v4, :cond_6

    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_6

    .line 166
    iput-object v1, v7, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    .line 167
    :cond_6
    const-string v4, "feature"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 168
    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_c

    .line 169
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->j:I

    .line 173
    :goto_5
    const-string v4, "tools"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v8, ","

    invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 175
    if-eqz v8, :cond_d

    array-length v4, v8

    if-lez v4, :cond_d

    aget-object v4, v8, v3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_d

    move v4, v3

    .line 176
    :goto_6
    array-length v9, v8

    if-ge v4, v9, :cond_e

    .line 177
    aget-object v9, v8, v4

    const-string v10, "cell"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v9, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    aput-boolean v12, v9, v3

    .line 178
    :cond_7
    aget-object v9, v8, v4

    const-string v10, "move"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    iget-object v9, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    aput-boolean v12, v9, v12

    .line 179
    :cond_8
    aget-object v9, v8, v4

    const-string v10, "remove"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    iget-object v9, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    const/4 v10, 0x3

    aput-boolean v12, v9, v10

    .line 180
    :cond_9
    aget-object v9, v8, v4

    const-string v10, "add"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    iget-object v9, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    const/4 v10, 0x2

    aput-boolean v12, v9, v10

    .line 181
    :cond_a
    aget-object v9, v8, v4

    const-string v10, "info"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    iget-object v9, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    aput-boolean v12, v9, v13

    .line 176
    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 171
    :cond_c
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->j:I

    goto :goto_5

    .line 185
    :cond_d
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    aput-boolean v12, v4, v3

    .line 186
    iget-object v4, v7, Lcom/saterskog/cell_lab/j$a;->h:[Z

    aput-boolean v12, v4, v13

    .line 188
    :cond_e
    const-string v4, "difficulty"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 189
    if-eqz v4, :cond_f

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_21

    .line 190
    :cond_f
    iput v3, v7, Lcom/saterskog/cell_lab/j$a;->u:I

    .line 193
    :goto_7
    const-string v4, "user-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 194
    if-eqz v4, :cond_10

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_22

    .line 195
    :cond_10
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->m:I

    .line 198
    :goto_8
    const-string v4, "black-level-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 199
    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_23

    .line 200
    :cond_11
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->z:I

    .line 202
    :goto_9
    const-string v4, "red-level-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 203
    if-eqz v4, :cond_12

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_24

    .line 204
    :cond_12
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->v:I

    .line 207
    :goto_a
    const-string v4, "red-level-cells-min"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 208
    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_25

    .line 209
    :cond_13
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->w:I

    .line 212
    :goto_b
    const-string v4, "yellow-level-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 213
    if-eqz v4, :cond_14

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_26

    .line 214
    :cond_14
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->x:I

    .line 217
    :goto_c
    const-string v4, "yellow-level-cells-min"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 218
    if-eqz v4, :cond_15

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_27

    .line 219
    :cond_15
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->y:I

    .line 222
    :goto_d
    const-string v4, "total-cells-min"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 223
    if-eqz v4, :cond_16

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_28

    .line 224
    :cond_16
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->n:I

    .line 227
    :goto_e
    const-string v4, "level-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 228
    if-eqz v4, :cond_17

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_29

    .line 229
    :cond_17
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->o:I

    .line 232
    :goto_f
    const-string v4, "level-cells-min"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 233
    if-eqz v4, :cond_18

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2a

    .line 234
    :cond_18
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->p:I

    .line 237
    :goto_10
    const-string v4, "hybrid-cells-min"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 238
    if-eqz v4, :cond_19

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2b

    .line 239
    :cond_19
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->l:I

    .line 242
    :goto_11
    const-string v4, "infected-level-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 243
    if-eqz v4, :cond_1a

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2c

    .line 244
    :cond_1a
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->s:I

    .line 247
    :goto_12
    const-string v4, "infected-level-cells-max"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 248
    if-eqz v4, :cond_1b

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2d

    .line 249
    :cond_1b
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->t:I

    .line 252
    :goto_13
    const-string v4, "place-cells"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 253
    if-eqz v4, :cond_1c

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2e

    .line 254
    :cond_1c
    iput v12, v7, Lcom/saterskog/cell_lab/j$a;->q:I

    .line 257
    :goto_14
    const-string v4, "remove-max"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 258
    if-eqz v4, :cond_1d

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2f

    .line 259
    :cond_1d
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->A:I

    .line 262
    :goto_15
    const-string v4, "user-cells-max"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 263
    if-eqz v4, :cond_1e

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_30

    .line 264
    :cond_1e
    iput v11, v7, Lcom/saterskog/cell_lab/j$a;->r:I

    .line 267
    :goto_16
    const-string v4, "max-time"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 268
    if-eqz v4, :cond_1f

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_31

    .line 269
    :cond_1f
    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    iput-wide v8, v7, Lcom/saterskog/cell_lab/j$a;->C:D

    .line 272
    :goto_17
    const-string v4, "win-time"

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j$b;->a(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 273
    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_32

    .line 274
    :cond_20
    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    iput-wide v8, v7, Lcom/saterskog/cell_lab/j$a;->B:D

    .line 277
    :goto_18
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    .line 192
    :cond_21
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->u:I

    goto/16 :goto_7

    .line 197
    :cond_22
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->m:I

    goto/16 :goto_8

    .line 202
    :cond_23
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->z:I

    goto/16 :goto_9

    .line 206
    :cond_24
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->v:I

    goto/16 :goto_a

    .line 211
    :cond_25
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->w:I

    goto/16 :goto_b

    .line 216
    :cond_26
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->x:I

    goto/16 :goto_c

    .line 221
    :cond_27
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->y:I

    goto/16 :goto_d

    .line 226
    :cond_28
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->n:I

    goto/16 :goto_e

    .line 231
    :cond_29
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->o:I

    goto/16 :goto_f

    .line 236
    :cond_2a
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->p:I

    goto/16 :goto_10

    .line 241
    :cond_2b
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->l:I

    goto/16 :goto_11

    .line 246
    :cond_2c
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->s:I

    goto/16 :goto_12

    .line 251
    :cond_2d
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->t:I

    goto/16 :goto_13

    .line 256
    :cond_2e
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->q:I

    goto/16 :goto_14

    .line 261
    :cond_2f
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->A:I

    goto/16 :goto_15

    .line 266
    :cond_30
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Lcom/saterskog/cell_lab/j$a;->r:I

    goto/16 :goto_16

    .line 271
    :cond_31
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    iput-wide v8, v7, Lcom/saterskog/cell_lab/j$a;->C:D

    goto/16 :goto_17

    .line 276
    :cond_32
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    iput-wide v8, v7, Lcom/saterskog/cell_lab/j$a;->B:D

    goto/16 :goto_18

    .line 280
    :cond_33
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method static declared-synchronized a()V
    .locals 2

    .prologue
    .line 383
    const-class v0, Lcom/saterskog/cell_lab/j;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/saterskog/cell_lab/j;->c:[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 384
    monitor-exit v0

    return-void

    .line 383
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;IJ)V
    .locals 10

    .prologue
    .line 550
    const-class v3, Lcom/saterskog/cell_lab/j;

    monitor-enter v3

    if-ltz p1, :cond_0

    :try_start_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 551
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tried to clock out challenge: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 579
    :goto_0
    monitor-exit v3

    return-void

    .line 554
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/saterskog/b/a;->c()J

    move-result-wide v0

    sub-long v4, v0, p2

    .line 555
    invoke-static {p0, p1}, Lcom/saterskog/cell_lab/j;->b(Landroid/content/Context;I)J

    move-result-wide v6

    .line 557
    const/4 v2, 0x0

    .line 558
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 560
    :try_start_2
    new-instance v1, Ljava/io/ObjectOutputStream;

    const/4 v8, 0x0

    invoke-virtual {p0, v0, v8}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 561
    const/4 v0, 0x0

    :try_start_3
    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 562
    add-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 572
    :try_start_4
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 578
    :cond_2
    :goto_1
    :try_start_5
    invoke-static {}, Lcom/saterskog/cell_lab/j;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    .line 550
    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    .line 575
    :catch_0
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_1

    .line 565
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_7
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 570
    if-eqz v1, :cond_2

    .line 572
    :try_start_8
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_1

    .line 575
    :catch_2
    move-exception v0

    :try_start_9
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_1

    .line 568
    :catch_3
    move-exception v0

    :goto_3
    :try_start_a
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 570
    if-eqz v2, :cond_2

    .line 572
    :try_start_b
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_1

    .line 575
    :catch_4
    move-exception v0

    :try_start_c
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_1

    .line 570
    :catchall_1
    move-exception v0

    :goto_4
    if-eqz v2, :cond_3

    .line 572
    :try_start_d
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 576
    :cond_3
    :goto_5
    :try_start_e
    throw v0

    .line 575
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    goto :goto_5

    .line 570
    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_4

    .line 568
    :catch_6
    move-exception v0

    move-object v2, v1

    goto :goto_3

    .line 565
    :catch_7
    move-exception v0

    goto :goto_2
.end method

.method static declared-synchronized a(ILcom/saterskog/cell_lab/CellWorld;)Z
    .locals 10

    .prologue
    .line 285
    const-class v5, Lcom/saterskog/cell_lab/j;

    monitor-enter v5

    :try_start_0
    iget-wide v6, p1, Lcom/saterskog/cell_lab/CellWorld;->N:D

    .line 286
    iget-wide v0, p1, Lcom/saterskog/cell_lab/CellWorld;->M:D

    iput-wide v0, p1, Lcom/saterskog/cell_lab/CellWorld;->N:D

    .line 287
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    .line 288
    const/4 v3, -0x1

    const/4 v1, -0x1

    const/4 v4, -0x1

    const/4 v2, -0x1

    .line 289
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->m:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_0

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->r:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_1

    .line 290
    :cond_0
    const/4 v4, 0x1

    invoke-virtual {p1, v4}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v4

    .line 291
    :cond_1
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->o:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_2

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->p:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_3

    .line 292
    :cond_2
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v3

    .line 293
    :cond_3
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->l:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_4

    .line 294
    const/4 v2, 0x6

    invoke-virtual {p1, v2}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v2

    .line 295
    :cond_4
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->s:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_5

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->o:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_5

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->p:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_6

    .line 296
    :cond_5
    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v1

    .line 298
    :cond_6
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->n:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_7

    iget v8, p1, Lcom/saterskog/cell_lab/CellWorld;->z:I

    iget v9, v0, Lcom/saterskog/cell_lab/j$a;->n:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ge v8, v9, :cond_7

    .line 299
    const/4 v0, 0x0

    .line 330
    :goto_0
    monitor-exit v5

    return v0

    .line 300
    :cond_7
    :try_start_1
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->m:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_8

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->m:I

    if-ge v4, v8, :cond_8

    .line 301
    const/4 v0, 0x0

    goto :goto_0

    .line 302
    :cond_8
    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->r:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_9

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->r:I

    if-le v4, v8, :cond_9

    .line 303
    const/4 v0, 0x0

    goto :goto_0

    .line 304
    :cond_9
    iget v4, v0, Lcom/saterskog/cell_lab/j$a;->o:I

    const/4 v8, -0x1

    if-eq v4, v8, :cond_a

    add-int v4, v3, v1

    iget v8, v0, Lcom/saterskog/cell_lab/j$a;->o:I

    if-le v4, v8, :cond_a

    .line 305
    const/4 v0, 0x0

    goto :goto_0

    .line 306
    :cond_a
    iget v4, v0, Lcom/saterskog/cell_lab/j$a;->p:I

    const/4 v8, -0x1

    if-eq v4, v8, :cond_b

    add-int/2addr v3, v1

    iget v4, v0, Lcom/saterskog/cell_lab/j$a;->p:I

    if-ge v3, v4, :cond_b

    .line 307
    const/4 v0, 0x0

    goto :goto_0

    .line 308
    :cond_b
    iget v3, v0, Lcom/saterskog/cell_lab/j$a;->s:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_c

    iget v3, v0, Lcom/saterskog/cell_lab/j$a;->s:I

    if-ge v1, v3, :cond_c

    .line 309
    const/4 v0, 0x0

    goto :goto_0

    .line 310
    :cond_c
    iget v3, v0, Lcom/saterskog/cell_lab/j$a;->t:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_d

    iget v3, v0, Lcom/saterskog/cell_lab/j$a;->t:I

    if-le v1, v3, :cond_d

    .line 311
    const/4 v0, 0x0

    goto :goto_0

    .line 312
    :cond_d
    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->l:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_e

    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->l:I

    if-ge v2, v1, :cond_e

    .line 313
    const/4 v0, 0x0

    goto :goto_0

    .line 314
    :cond_e
    iget-wide v2, v0, Lcom/saterskog/cell_lab/j$a;->C:D

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    cmpl-double v1, v2, v8

    if-eqz v1, :cond_f

    iget-wide v2, p1, Lcom/saterskog/cell_lab/CellWorld;->M:D

    iget-wide v8, v0, Lcom/saterskog/cell_lab/j$a;->C:D

    cmpl-double v1, v2, v8

    if-lez v1, :cond_f

    .line 315
    const/4 v0, 0x0

    goto :goto_0

    .line 316
    :cond_f
    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->z:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_10

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/CellWorld;->c()I

    move-result v1

    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->z:I

    if-le v1, v2, :cond_10

    .line 317
    const/4 v0, 0x0

    goto :goto_0

    .line 318
    :cond_10
    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->v:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_11

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/CellWorld;->d()I

    move-result v1

    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->v:I

    if-le v1, v2, :cond_11

    .line 319
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 320
    :cond_11
    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->w:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_12

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/CellWorld;->d()I

    move-result v1

    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->w:I

    if-ge v1, v2, :cond_12

    .line 321
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 322
    :cond_12
    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->x:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_13

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/CellWorld;->e()I

    move-result v1

    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->x:I

    if-le v1, v2, :cond_13

    .line 323
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 324
    :cond_13
    iget v1, v0, Lcom/saterskog/cell_lab/j$a;->y:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_14

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/CellWorld;->e()I

    move-result v1

    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->y:I

    if-ge v1, v2, :cond_14

    .line 325
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 326
    :cond_14
    iput-wide v6, p1, Lcom/saterskog/cell_lab/CellWorld;->N:D

    .line 327
    iget-wide v2, v0, Lcom/saterskog/cell_lab/j$a;->B:D

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    cmpl-double v1, v2, v6

    if-eqz v1, :cond_15

    iget-wide v2, p1, Lcom/saterskog/cell_lab/CellWorld;->M:D

    iget-wide v6, p1, Lcom/saterskog/cell_lab/CellWorld;->N:D

    sub-double/2addr v2, v6

    iget-wide v0, v0, Lcom/saterskog/cell_lab/j$a;->B:D
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmpg-double v0, v2, v0

    if-gez v0, :cond_15

    .line 328
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 330
    :cond_15
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 285
    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0
.end method

.method static declared-synchronized a(I[Lcom/saterskog/cell_lab/Gene;Landroid/content/Context;)Z
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 431
    const-class v5, Lcom/saterskog/cell_lab/j;

    monitor-enter v5

    :try_start_0
    sget-object v6, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v7, v6

    move v4, v2

    :goto_0
    if-ge v4, v7, :cond_2

    aget-object v8, v6, v4

    move v3, v2

    move v1, v2

    .line 433
    :goto_1
    const/16 v0, 0x28

    if-ge v3, v0, :cond_0

    .line 434
    aget-object v0, p1, v3

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    if-ne v0, v8, :cond_3

    add-int/lit8 v0, v1, 0x1

    .line 433
    :goto_2
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    goto :goto_1

    .line 436
    :cond_0
    invoke-static {p2}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->k:[I

    invoke-virtual {v8}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v3

    aget v0, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 437
    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    if-le v1, v0, :cond_1

    move v0, v2

    .line 439
    :goto_3
    monitor-exit v5

    return v0

    .line 431
    :cond_1
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 439
    :cond_2
    const/4 v0, 0x1

    goto :goto_3

    .line 431
    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method static a(Landroid/content/Context;I)Z
    .locals 1

    .prologue
    .line 370
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    .line 372
    :goto_0
    return v0

    .line 371
    :cond_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->b:[Z

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->e(Landroid/content/Context;)V

    .line 372
    :cond_1
    sget-object v0, Lcom/saterskog/cell_lab/j;->b:[Z

    aget-boolean v0, v0, p1

    goto :goto_0
.end method

.method public static declared-synchronized a(I)[Z
    .locals 5

    .prologue
    const/4 v4, 0x5

    .line 501
    const-class v2, Lcom/saterskog/cell_lab/j;

    monitor-enter v2

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    :try_start_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->h:[Z

    if-nez v0, :cond_1

    .line 502
    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [Z

    .line 503
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_2

    .line 504
    const/4 v3, 0x1

    aput-boolean v3, v0, v1

    .line 503
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 507
    :cond_1
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->h:[Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v2

    return-object v0

    .line 501
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public static declared-synchronized b(Landroid/content/Context;I)J
    .locals 10

    .prologue
    .line 522
    const-class v5, Lcom/saterskog/cell_lab/j;

    monitor-enter v5

    const-wide/16 v2, 0x0

    .line 523
    :try_start_0
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v1, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    .line 524
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->d(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    array-length v6, v4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v6, :cond_4

    aget-object v7, v4, v0

    .line 525
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".time"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v7

    if-eqz v7, :cond_3

    .line 526
    const/4 v1, 0x0

    .line 528
    :try_start_1
    new-instance v4, Ljava/io/ObjectInputStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ".time"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 529
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 530
    if-eqz v0, :cond_0

    .line 531
    const-string v0, "LevelManager time version mismatch."

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 532
    :cond_0
    invoke-virtual {v4}, Ljava/io/ObjectInputStream;->readLong()J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-wide v0

    .line 539
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ObjectInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 547
    :goto_1
    monitor-exit v5

    return-wide v0

    .line 542
    :catch_0
    move-exception v2

    :try_start_4
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    .line 522
    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    .line 535
    :catch_1
    move-exception v0

    :goto_2
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 537
    if-eqz v1, :cond_2

    .line 539
    :try_start_6
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-wide v0, v2

    .line 543
    goto :goto_1

    .line 542
    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-wide v0, v2

    .line 543
    goto :goto_1

    .line 537
    :catchall_1
    move-exception v0

    :goto_3
    if-eqz v1, :cond_1

    .line 539
    :try_start_8
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 543
    :cond_1
    :goto_4
    :try_start_9
    throw v0

    .line 542
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_4

    :cond_2
    move-wide v0, v2

    .line 545
    goto :goto_1

    .line 524
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 537
    :catchall_2
    move-exception v0

    move-object v1, v4

    goto :goto_3

    .line 535
    :catch_4
    move-exception v0

    move-object v1, v4

    goto :goto_2

    :cond_4
    move-wide v0, v2

    goto :goto_1
.end method

.method static declared-synchronized b(ILandroid/content/Context;)Z
    .locals 2

    .prologue
    .line 387
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/saterskog/cell_lab/j;->b(Ljava/lang/String;Landroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static declared-synchronized b(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 338
    const-class v4, Lcom/saterskog/cell_lab/j;

    monitor-enter v4

    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 340
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 v3, 0x7e2

    if-gt v2, v3, :cond_3

    move v3, v0

    .line 350
    :goto_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->d(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    move v2, v1

    :goto_1
    if-ge v2, v6, :cond_2

    aget-object v7, v5, v2

    .line 351
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".win"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    if-eqz v3, :cond_1

    const-string v8, "imafilthycheater.substrate"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v7

    if-eqz v7, :cond_1

    .line 353
    :cond_0
    :goto_2
    monitor-exit v4

    return v0

    .line 350
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 353
    goto :goto_2

    .line 338
    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_3
    move v3, v1

    goto :goto_0
.end method

.method static declared-synchronized b(Landroid/content/Context;)[Ljava/lang/String;
    .locals 4

    .prologue
    .line 445
    const-class v2, Lcom/saterskog/cell_lab/j;

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    .line 446
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, v3

    if-ge v1, v0, :cond_0

    .line 447
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->a:Ljava/lang/String;

    aput-object v0, v3, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 448
    :cond_0
    monitor-exit v2

    return-object v3

    .line 445
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public static declared-synchronized c(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 514
    const-class v2, Lcom/saterskog/cell_lab/j;

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 515
    const/4 v1, 0x0

    :goto_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 516
    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v1, p0}, Lcom/saterskog/cell_lab/j;->b(ILandroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 518
    :goto_1
    monitor-exit v2

    return v0

    .line 515
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 518
    :cond_1
    const/4 v0, -0x1

    goto :goto_1

    .line 514
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method static declared-synchronized c(ILandroid/content/Context;)V
    .locals 5

    .prologue
    .line 395
    const-class v3, Lcom/saterskog/cell_lab/j;

    monitor-enter v3

    const/4 v2, 0x0

    .line 397
    :try_start_0
    new-instance v1, Ljava/io/ObjectOutputStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ".win"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 398
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 408
    :try_start_2
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 414
    :cond_0
    :goto_0
    :try_start_3
    invoke-static {}, Lcom/saterskog/cell_lab/j;->a()V

    .line 415
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->e(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 420
    monitor-exit v3

    return-void

    .line 411
    :catch_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 395
    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    .line 401
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 406
    if-eqz v1, :cond_0

    .line 408
    :try_start_6
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    .line 411
    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    .line 404
    :catch_3
    move-exception v0

    :goto_2
    :try_start_8
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 406
    if-eqz v2, :cond_0

    .line 408
    :try_start_9
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_0

    .line 411
    :catch_4
    move-exception v0

    :try_start_a
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_0

    .line 406
    :catchall_1
    move-exception v0

    :goto_3
    if-eqz v2, :cond_1

    .line 408
    :try_start_b
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 412
    :cond_1
    :goto_4
    :try_start_c
    throw v0

    .line 411
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_4

    .line 406
    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_3

    .line 404
    :catch_6
    move-exception v0

    move-object v2, v1

    goto :goto_2

    .line 401
    :catch_7
    move-exception v0

    goto :goto_1
.end method

.method static declared-synchronized d(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 422
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static declared-synchronized d(Landroid/content/Context;)[Ljava/lang/String;
    .locals 2

    .prologue
    .line 333
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->c:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 334
    invoke-virtual {p0}, Landroid/content/Context;->fileList()[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/saterskog/cell_lab/j;->c:[Ljava/lang/String;

    .line 335
    :cond_0
    sget-object v0, Lcom/saterskog/cell_lab/j;->c:[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 333
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static declared-synchronized e(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 425
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static e(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 357
    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lcom/saterskog/cell_lab/j;->b:[Z

    .line 362
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    .line 363
    iget-object v2, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-static {v2, p0}, Lcom/saterskog/cell_lab/j;->b(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 364
    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->j:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 365
    sget-object v2, Lcom/saterskog/cell_lab/j;->b:[Z

    iget v0, v0, Lcom/saterskog/cell_lab/j$a;->j:I

    const/4 v3, 0x1

    aput-boolean v3, v2, v0

    goto :goto_0

    .line 366
    :cond_1
    return-void
.end method

.method static declared-synchronized f(ILandroid/content/Context;)I
    .locals 2

    .prologue
    .line 428
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget v0, v0, Lcom/saterskog/cell_lab/j$a;->u:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static declared-synchronized g(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 442
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->e:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized h(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 451
    const-class v1, Lcom/saterskog/cell_lab/j;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized i(ILandroid/content/Context;)[Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 454
    const-class v4, Lcom/saterskog/cell_lab/j;

    monitor-enter v4

    const/4 v0, -0x1

    if-ne p0, v0, :cond_2

    .line 455
    :try_start_0
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    new-array v1, v0, [Z

    .line 460
    invoke-static {p1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    .line 461
    iget-object v3, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-static {v3, p1}, Lcom/saterskog/cell_lab/j;->b(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 462
    iget-object v3, v0, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 463
    iget-object v3, v0, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    array-length v5, v3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v5, :cond_0

    aget-object v6, v3, v0

    .line 464
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/saterskog/cell_lab/h;->valueOf(Ljava/lang/String;)Lcom/saterskog/cell_lab/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v6

    const/4 v7, 0x1

    aput-boolean v7, v1, v6

    .line 463
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 468
    :cond_1
    sget-object v0, Lcom/saterskog/cell_lab/h;->c:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v0

    const/4 v2, 0x1

    aput-boolean v2, v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v1

    .line 495
    :goto_1
    monitor-exit v4

    return-object v0

    .line 474
    :cond_2
    :try_start_1
    new-instance v3, Ljava/io/ObjectInputStream;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {p0, p1}, Lcom/saterskog/cell_lab/j;->h(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 476
    :try_start_2
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 477
    const/16 v2, 0x5f

    if-le v0, v2, :cond_4

    .line 478
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Opening file from different version"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 485
    :catch_0
    move-exception v0

    move-object v2, v3

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 488
    if-eqz v2, :cond_3

    .line 489
    :try_start_4
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_3
    move-object v2, v1

    .line 495
    :goto_3
    :try_start_5
    iget-object v0, v2, Lcom/saterskog/cell_lab/Environment;->t:[Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 479
    :cond_4
    :try_start_6
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readDouble()D

    .line 480
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readInt()I

    .line 481
    new-instance v2, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v2}, Lcom/saterskog/cell_lab/Environment;-><init>()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 482
    :try_start_7
    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/Environment;->a(Ljava/io/ObjectInputStream;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 489
    :try_start_8
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_3

    .line 492
    :catch_1
    move-exception v0

    :try_start_9
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_3

    .line 454
    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    .line 492
    :catch_2
    move-exception v0

    :try_start_a
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object v2, v1

    .line 494
    goto :goto_3

    .line 487
    :catchall_1
    move-exception v0

    move-object v3, v1

    .line 488
    :goto_4
    if-eqz v3, :cond_5

    .line 489
    :try_start_b
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 493
    :cond_5
    :goto_5
    :try_start_c
    throw v0

    .line 492
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_5

    .line 487
    :catchall_2
    move-exception v0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v3, v2

    goto :goto_4

    .line 485
    :catch_4
    move-exception v0

    move-object v2, v1

    goto :goto_2

    :catch_5
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_2
.end method
