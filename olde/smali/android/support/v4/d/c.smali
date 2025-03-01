.class public final Landroid/support/v4/d/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Locale;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 114
    new-instance v0, Ljava/util/Locale;

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroid/support/v4/d/c;->a:Ljava/util/Locale;

    .line 116
    const-string v0, "Arab"

    sput-object v0, Landroid/support/v4/d/c;->b:Ljava/lang/String;

    .line 117
    const-string v0, "Hebr"

    sput-object v0, Landroid/support/v4/d/c;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/util/Locale;)I
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 76
    if-eqz p0, :cond_2

    sget-object v2, Landroid/support/v4/d/c;->a:Ljava/util/Locale;

    invoke-virtual {p0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 77
    invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/d/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 79
    if-nez v2, :cond_1

    .line 1103
    invoke-virtual {p0, p0}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v2

    packed-switch v2, :pswitch_data_0

    move v0, v1

    .line 1106
    :cond_0
    :goto_0
    :pswitch_0
    return v0

    .line 81
    :cond_1
    sget-object v3, Landroid/support/v4/d/c;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Landroid/support/v4/d/c;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    .line 87
    goto :goto_0

    .line 1103
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
